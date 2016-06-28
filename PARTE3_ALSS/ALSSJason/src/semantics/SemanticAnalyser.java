package semantics;

import symboltable.Reference;
import symboltable.SymbolTable;
import symboltable.Category;
import jason.Token;

public class SemanticAnalyser {

	// Symbol Table
	SymbolTable st = new SymbolTable();
	int currentLevel = 0;
	
	Reference refIdentifier = null;
	
	// Array creator
	int arrayCounter = 0;
	Reference currentArray = null;
	
	// Record creator
	int recordCounter = 0;
	boolean definingRecord = false;
	String currentRecordId;
	
	// DataType storage
	Reference currentDataType;
	
	// Record checking
	Reference lastVariable;
	
	// ArgList number of parameters checking
	Reference lastProcFunc;
	int procFuncArgList = 0;
	
	public SemanticAnalyser() {

	}
	
	// Semantic routines
	public void rs(int n, Token t) {
		final String id = (t!=null)? t.image : "unknown";
		
		//System.out.println("rs("+n+")");
		
		// Switch semantic routine number
		switch(n) {
			case 0: { // Check if identifier is already declared
				String idName = id;
				if(definingRecord)
					idName = currentRecordId+"."+id;
				
				if(st.isDeclared(idName, currentLevel))
					error("Identificador '"+id+"' já declarado", t);
			} break;

			case 1: { // Create array type
				String newType = "array"+arrayCounter;
				arrayCounter++;
				
				// Create array reference
				currentArray = st.insert(currentLevel, newType);
				currentArray.category = Category.TYPE;
				
				// References current identifier to array type
				refIdentifier.type = st.search(newType);
			} break;
			
			case 2: { // Check if identifier is not declared
				if(!st.isDeclared(id, currentLevel))
					error("Identicador '"+id+"' não definido", t);
			} break;

			case 3: { // Declare identifier (add to ST)
				String idName = id;
				
				// Record definition specification
				if(definingRecord)
					idName = currentRecordId+"."+id;
				
				// Declare identifier
				refIdentifier = st.insert(currentLevel, idName);
				refIdentifier.level = currentLevel;
			} break;

			case 4: { // Check if identifier is a TYPE
				Reference ref = st.search(id);
				if(ref!=null) {
					if(ref.category!=Category.TYPE)
						error("Identificador "+id+" não é um tipo", t);
				}
			} break;

			case 5: { // Create array and set type to identifier
				currentArray.type = st.search(id);
			} break;

			case 6: { // Check array numeric literal size
				Integer size = Integer.valueOf(id);
				if(size <= 0) {
					error("Array de tamanho negativo ou nulo", t);
				} else {
					long maxInt = (long)Math.pow(2, 31)-1;
					if(size > maxInt)
						error("Tamanho do array excedido", t);
				}
			} break;

			case 7: { // Set array size to current array
				if(currentArray!=null)
					currentArray.arraySize = Integer.valueOf(id);
			} break;
			
			case 8: { // Create record type
				String newType = "record"+recordCounter;
				recordCounter++;
				
				// Store record id
				definingRecord = true;
				currentRecordId = newType;
				
				// Create record reference
				Reference record = st.insert(currentLevel, newType);
				record.category = Category.TYPE;
				
				// References current identifier to record type
				refIdentifier.type = st.search(newType);
			} break;
			
			case 9: { // Set current identifier category: TYPE
				if(refIdentifier!=null)
					refIdentifier.category = Category.TYPE;
			} break;
			
			case 10: { // End record definition 
				definingRecord = false;
			} break;
			
			case 11: { // Set current identifier category: PROCEDURE
				if(refIdentifier!=null) {
					refIdentifier.category = Category.PROCEDURE;
					refIdentifier.numParameters = 0;
				}
				
				lastProcFunc = refIdentifier;
				
				// Inc level
				currentLevel++;
			} break;
			
			case 12: { // Increment procedure parameters number
				if(lastProcFunc!=null)
					lastProcFunc.numParameters++;		
			} break;
			
			case 13: { // Store DataType for variable/parameter definition
				currentDataType = st.search(id);
			} break;
			
			case 14: { // Set DataType (saved) category to parameter
				if(refIdentifier!=null) {
					refIdentifier.category = Category.PARAMETER;
					refIdentifier.type = currentDataType;
				}
			} break;
			
			case 15: { // Set current identifier category: FUNCTION
				if(refIdentifier!=null) {
					refIdentifier.category = Category.FUNCTION;
					refIdentifier.numParameters = 0;
				}
				
				lastProcFunc = refIdentifier;
				
				// Inc level
				currentLevel++;
			} break;
			
			case 16: { // Set DataType (current id) to current identifier
				refIdentifier.type = st.search(id);
			} break;
			
			case 17: { // Decrement level, end of block
				// Erase entire level
				st.removeLevel(currentLevel);
				
				currentLevel--;
			} break;

			case 18: { // Check if identifier is a PROCEDURE
				Reference ref = st.search(id);
				if(ref!=null) {
					if(ref.category!=Category.PROCEDURE)
						error("Identificador "+id+" não é um procedimento", t);
					else {
						lastProcFunc = ref;
						procFuncArgList = 0;
					}
				}
			} break;
			
			case 19: { // Check if identifier is a FUNCTION
				Reference ref = st.search(id);
				if(ref!=null) {
					if(ref.category!=Category.FUNCTION)
						error("Identificador "+id+" não é uma função", t);
					else {
						lastProcFunc = ref;
						procFuncArgList = 0;
					}
				}
			} break;
			
			case 20: { // Check if identifier is a FUNCTION or PROCEDURE
				Reference ref = st.search(id);
				if(ref!=null) {
					if(ref.category!=Category.FUNCTION && ref.category!=Category.PROCEDURE)
						error("Identificador '"+id+"' não é um procedimento ou função", t);
					else {
						lastProcFunc = ref;
						procFuncArgList = 0;
					}
				}
			} break;
			
			case 21: { // Check numeric literal
				Integer intValue = Integer.valueOf(id);
				long maxInt = (long)Math.pow(2, 31)-1;
				if(Math.abs(intValue) > maxInt)
					error("Overflow de inteiro (max: "+maxInt+")", t);
			} break;
			
			case 22: { // Check string literal
				if(id.length() > 255)
					error("Overflow de string (max 255 caracteres)", t);
			} break;
			
			case 23: { // Check if identifier is a VARIABLE
				Reference ref = st.search(id);
				if(ref!=null) {
					if(ref.category!=Category.VARIABLE)
						error("Identificador '"+id+"' não é uma variável", t);
					else {
						lastVariable = ref;
					}
				}
			} break;
			
			case 24: { // Set current identifier category: VARIABLE
				if(refIdentifier!=null) {
					refIdentifier.category = Category.VARIABLE;
					refIdentifier.type = currentDataType;
				}
			} break;
			
			case 25: { // Check if variable is an array type
				if(lastVariable!=null && !lastVariable.type.type.id.contains("array"))
					error("Identificador '"+lastVariable.id+"' não é um array", t);
			} break;
			
			case 26: { // Check if record variable identifier is valid
				String recordVariableId = lastVariable.type.id + id;
				Reference ref = st.search(recordVariableId);
				if(ref==null)
					error("Acessando membro do record '"+recordVariableId+"' não definido", t);
			} break;
			
			case 27: { // Increment number of parameters in ArgList
				procFuncArgList++;
			} break;
			
			case 28: { // Check if ArgList parameters is equal to func/proc numParameters
				if(lastProcFunc!=null && lastProcFunc.numParameters!=procFuncArgList)
					error("Procedimento ou função chamado com número incorreto de parâmetros; entrada: "+procFuncArgList+", esperado: "+lastProcFunc.numParameters, t);
			} break;
			
			/// TODO: Check "var1.var2", where var1 needs to be a record
			/// TODO: Check array bounds on access
		}
		
	}
	
	private void error(String error, Token t) {
		if(t==null)
			System.out.println("Erro: "+error+".");
		else
			System.out.println("Erro: "+error+"; linha "+t.beginLine+", coluna "+t.beginColumn+".");
	}
}

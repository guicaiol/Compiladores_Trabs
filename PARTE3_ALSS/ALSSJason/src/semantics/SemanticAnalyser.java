package semantics;

import symboltable.Reference;
import symboltable.SymbolTable;
import symboltable.Category;
import jason.Token;

public class SemanticAnalyser {

	// Symbol Table
	SymbolTable st = new SymbolTable();;
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
	
	public SemanticAnalyser() {

	}
	
	// Semantic routines
	public void rs(int n, Token t) {
		final String id = t.image;
		
		System.out.println("rs("+n+") ");
		
		// Switch semantic routine number
		switch(n) {
		
			case 0: { // Check if identifier is already declared
				if(st.isDeclared(id, currentLevel))
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
			
			case 2: { // Check if identifier type is not declared
				if(!st.isDeclared(id, currentLevel))
					error("Tipo '"+id+"' não definido", t);
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

			case 4: { // Check if identifier is a type
				Reference ref = st.search(id);
				if(ref.category!=Category.TYPE)
					error("Identificador "+id+" não é um tipo", t);
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
				refIdentifier.category = Category.TYPE;
			} break;
			
			case 10: { // End record definition 
				definingRecord = false;
			} break;
			
			case 11: { // Set current identifier category: PROCEDURE 
				refIdentifier.category = Category.PROCEDURE;
				refIdentifier.numParameters = 0;
				
				// Inc level
				currentLevel++;
				// TODO: lembrar de descer o nivel HHHHHHHHHHHHHHHHHHHHHHHHHHH
			} break;
			
			case 12: { // Increment procedure parameters number
				refIdentifier.numParameters++;		
			} break;
			
			case 13: { // Store DataType for variable/parameter definition
				currentDataType = st.search(id);
			} break;
			
			case 14: { // Set DataType (saved) to parameter
				refIdentifier.category = Category.PARAMETER;
				refIdentifier.type = currentDataType;
			} break;
			
			case 15: { // Set current identifier category: FUNCTION
				refIdentifier.category = Category.FUNCTION;
				refIdentifier.numParameters = 0;
				
				// Inc level
				currentLevel++;
				// TODO: lembrar de descer o nivel HHHHHHHHHHHHHHHHHHHHHHHHHHH
			} break;
			
			case 16: { // Set DataType (current id) to current identifier
				refIdentifier.type = st.search(id);
			} break;
			
			case 17: {
				// TODO: continuar a partir de Block e FunctionBlock
			} break;
			
				
		}
	}
	
	private void error(String error, Token t) {
		System.out.println("Erro: "+error+"; linha "+t.beginLine+", coluna "+t.beginColumn+".");
	}
}

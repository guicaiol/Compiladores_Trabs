package symboltable;

import symboltable.Reference;

import java.util.Map;
import java.util.HashMap;

public class SymbolTable {
	
	// Hash table
	private HashMap<Integer, HashMap<String,Reference>> table;
	
	public SymbolTable() {
		// Create HashMap
		table = new HashMap<>();
		checkLevelHash(0);
		
		// Create native types and procedure
		Reference refString = insert(0, "string");
		refString.category = Category.TYPE;
		refString.numBytes = 256;
		
		Reference refInteger = insert(0, "integer");
		refInteger.category = Category.TYPE;
		refInteger.numBytes = 4;
		
		Reference refReal = insert(0, "real");
		refReal.category = Category.TYPE;
		refReal.numBytes = 8;
		
		Reference refRead = insert(0, "read");
		refRead.category = Category.PROCEDURE;
		
		Reference refWrite = insert(0, "write");
		refWrite.category = Category.PROCEDURE;
	}
	
	public Reference search(String id) {
		for(Map.Entry<Integer,HashMap<String,Reference>> entry : table.entrySet()) {
			HashMap<String,Reference> table = entry.getValue();

			// Check level hash
			Reference ref = table.get(id);
			if(ref!=null)
				return ref;
		}
		
		return null;
	}
	
	public void removeLevel(int level) {
		// Remove level hash
		table.remove(level);
	}
	
	public Reference insert(int level, String id) {
		// Create new reference
		Reference ref = new Reference(id);
		
		// Check level hash
		checkLevelHash(level);
		
		// Add to hash
		table.get(level).put(id, ref);
		
		// Return
		return ref;
	}
	
	public boolean isDeclared(String id, int level) {
		checkLevelHash(level);
		
		// Check level
		return (table.get(level).get(id)!=null);
	}
	
	private void checkLevelHash(int level) {
		// Check if level hash is created
		if(table.get(level)==null)
			table.put(level, new HashMap<>());
	}
	
}

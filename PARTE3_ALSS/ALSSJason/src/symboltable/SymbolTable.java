package symboltable;

import symboltable.Reference;

import java.util.Map;
import java.util.HashMap;

public class SymbolTable {
	
	// Hash table
	HashMap<String,Reference> table;
	
	public SymbolTable() {
		// Create HashMap
		table = new HashMap<>();
		
		// Create native types and procedure
		Reference refString = insert("string");
		refString.category = Category.TYPE;
		refString.numBytes = 256;
		
		Reference refInteger = insert("integer");
		refInteger.category = Category.TYPE;
		refInteger.numBytes = 4;
		
		Reference refReal = insert("real");
		refReal.category = Category.TYPE;
		refReal.numBytes = 8;
		
		Reference refRead = insert("read");
		refRead.category = Category.PROCEDURE;
		
		Reference refWrite = insert("write");
		refWrite.category = Category.PROCEDURE;
	}
	
	Reference search(String id) {
		// Return from hash
		return table.get(id);
	}
	
	void removeLevel(int level) {
		// Iterate through hash
		for(Map.Entry<String,Reference> entry : table.entrySet()) {
			String id = entry.getKey();
			Reference ref = entry.getValue();
			
			// Check and remove level
			if(ref.level==level)
				table.remove(id);
		}
	}
	
	Reference insert(String id) {
		// Create new reference
		Reference ref = new Reference();
		
		// Add to hash
		table.put(id, ref);
		
		// Return
		return ref;
	}
	
	boolean isDeclared(String id, int level) {
		// Search
		Reference ref = search(id);
		
		// Check not found
		if(ref==null)
			return false;
		
		// Check level
		return (ref.level==level);
	}
	
}

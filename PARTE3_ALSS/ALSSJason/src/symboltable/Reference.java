package symboltable;

import symboltable.Category;

public class Reference {
	
	public String id;
	public int level;
	public Category category;
	public Reference type;
	public int address;
	public int numBytes;
	public String value;
	public String classTransf;
	public int numParameters;
	public int arraySize;
	
	public Reference(String id) {
		this.id = id;
		
		level = 0;
		category = Category.UNDEFINED;
		type = null;
		address = 0;
		numBytes = 0;
		value = "";
		classTransf = "";
		numParameters = 0;
		arraySize = 0;
	}
	
}

package semantics;

import symboltable.SymbolTable;
import jason.Token;

public class SemanticAnalyser {

	// Symbol Table
	SymbolTable st;
	
	public SemanticAnalyser() {
		// Create SymbolTable
		st = new SymbolTable();
	}
	
	// Semantic routines
	public void rs(int n, Token t) {
		System.out.print("rs("+n+") ");
		
		// Switch semantic routine number
		switch(n) {
			case 0:
				
				
			break;
		}
	}
	
}

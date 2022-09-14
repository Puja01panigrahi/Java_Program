package com.OOPsConcepts;

public class Block {
	
	static String name;
	
	//Static Intialisation Block(SIB)
	static {
		name="Puja";
		System.out.println("Hello World");
		System.out.println("Name :-"+name);
	}

	public static void main(String[] args) {
		
		System.out.println("Main Starts");
		System.out.println("Main ends"); 

	}

}

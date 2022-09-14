package com.OopsProgram;

//Explicit constructor chaining

public class Class2 extends Class1{

	public Class2(String ProdcutID) {
		super("TEN6353");
		System.out.println("Class2 constructor");
	}
	
	public static void main(String[] args) {
		Class2 C= new Class2("");
		C.product();
	}
	
	
}
package com.OopsProgram;


//Explicit constructor chaining

public class Class1 {

String ProdcutID="SHET353";
	
	public Class1(String ProdcutID) {
		
		this.ProdcutID=ProdcutID;
		System.out.println("Class1  constructor");
	}
	
    public void product() {
    	System.out.println("ProdcutID = "+ProdcutID);
    }
}

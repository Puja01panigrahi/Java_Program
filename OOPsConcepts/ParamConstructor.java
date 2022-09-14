package com.OOPsConcepts;

public class ParamConstructor {
	
	ParamConstructor() {
		System.out.println("Default constructor");
	}
	
	ParamConstructor(int a) {
		
		System.out.println("Parametrise constructor with args a= " + a);
	}

	public static void main(String[] args) {
		
		ParamConstructor d1= new ParamConstructor();
		
		
		ParamConstructor d2= new ParamConstructor(38);

		ParamConstructor d3= new ParamConstructor(9838);
	}

}
 
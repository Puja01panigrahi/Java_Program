package com.OOPsConcepts;

public class ConstructorOverloading {
	
	public ConstructorOverloading() {
		
		System.out.println("Defalut Constructor");
	}
	
public ConstructorOverloading(int a) {
		
		System.out.println("Parameter Constructor with args a= "+a);
	}

public ConstructorOverloading(double d,String s) {
	
	System.out.println("Constructor with double d= "+ "and s= "+s);
}

	public static void main(String[] args) {
		
		ConstructorOverloading C= new ConstructorOverloading();
		
		ConstructorOverloading C1= new ConstructorOverloading(345);
		
		ConstructorOverloading C2= new ConstructorOverloading(345.987,"Hello");

		

	}

}

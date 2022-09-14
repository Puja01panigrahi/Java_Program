package com.OOPsConcepts;

public class NonStatic {
	
	//Non-static variable or Instance variable or Data member
	
	String name;
	int age;

	public static void main(String[] args) {
		
		NonStatic n= new NonStatic();
		n.name="Puja";
		n.age=28;
		
		System.out.println("Name :" +n.name);
		System.out.println("Age :" +n.age);
		

	}

}

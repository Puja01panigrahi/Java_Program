package com.OOPsConcepts;

public class StaticVariable {
	
	//Static variable/Data Member
	
	static String name;
	static int age;

	public static void main(String[] args) {
		
		System.out.println("Name : "+ name);
		System.out.println("Age : "+ age);
		
		name="Puja";
		age=28;
		
		System.out.println("Name : "+ name);
		System.out.println("Age : "+ age);
		

	}

}

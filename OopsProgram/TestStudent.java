package com.OopsProgram;

public class TestStudent {

	public static void main(String[] args) {
		
		//Aggregation in Java=Has-A Relationship
		
		Address adr=new Address("India","Odisha","Rourkela");
		Student s= new Student("Puja", 28, "EEE",adr);
		s.display();
	}

}

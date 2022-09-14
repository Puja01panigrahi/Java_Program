package com.OopsProgram;

public class Student {
	
	String Name;
	int age;
	String Subject;
	Address adr;
	
	public Student(String Name,int age,String Subject,Address adr ) {
		
		this.Name=Name;
		this.age=age;
		this.Subject= Subject;
		this.adr=adr;
		
	}
	
	public void display() {
		
		System.out.println("[ Name : "+Name+" , Age : "+age+" , Subject : "+Subject+"]");
		System.out.println(adr.displayAd());
	}

}

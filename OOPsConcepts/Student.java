package com.OOPsConcepts;


// Constructor examples

public class Student {
	
	String Name;
	int Age;
	int Rollnum;
	
	public Student(String Name,int Age,int Rollnum) {
		
		this.Name=Name;
		this.Age=Age;
		this.Rollnum=Rollnum;
	}
	
	public String display() {
		
		return "[Name :-"+Name+",Age :-"+Age+", Rollnum:-"+Rollnum+"]";
	}

	public static void main(String[] args) {
		
		Student s=new Student("Puja",28,890);
		System.out.println(s.display());
		
		Student s1=new Student("Pupu",5,8923);
		System.out.println(s1.display());

	}

}

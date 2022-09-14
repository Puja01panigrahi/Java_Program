package com.OopsProgram;

public class Encaps {
	
	private String Name;
	private int Age;
	


	public String getName() {
		return Name;
	}



	public int getAge() {
		return Age;
	}



	public void setName(String name) {
		Name = name;
	}



	public void setAge(int age) {
		Age = age;
	}



	public static void main(String[] args) {
		Encaps E =new Encaps();
		E.setName("Puja");
		E.setAge(28);
		System.out.println("Name : "+E.getName()+", Age : "+E.getAge());
		

	}

}

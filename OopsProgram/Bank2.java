package com.OopsProgram;

//Method Overriding

public class Bank2 {
	
	public void interestRate() {
		
		double a=11.5;
		System.out.println("Rate of interest a is "+a);
	}


	public static void main(String[] args) {
	
		Bank2 B= new Bank2();
		B.interestRate();

	}

}

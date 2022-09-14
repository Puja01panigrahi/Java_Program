package com.OopsProgram;

//Upcasting in java

public class ICICI extends RBI {

public void interestRate() {
		
		System.out.println("Rate of interest a is 11.5 ");
	}

public void interestRate1() {
	
	System.out.println("Rate of interest a is 12.95 ");
}
	
	public static void main(String[] args) {
		
		//Runtime Polymorphism
		
		RBI C= new ICICI();
		C.interestRate();

	}

}

package com.OopsProgram;


public class TestPolymorphism {

	public static void main(String[] args) {
	
		Bank b1,b2,b3;
		
		b1=new Sbi();
		System.out.println("Rate of Interest = "+b1.getrateofinterest());
		
		b2=new Axis();
		System.out.println("Rate of Interest = "+b2.getrateofinterest());
		
		b3=new Hdfc();
		System.out.println("Rate of Interest = "+b3.getrateofinterest());

	}

}

package com.OopsProgram;


public class FinalKeyword {
	
	  final static int a= 234567;
	
	public static void main(String[] args) {
		
		System.out.println("a = "+a);
		//It's showing error because we declare the variable as final
		//a= 5678;
		//System.out.println("a = "+a);
	}

}

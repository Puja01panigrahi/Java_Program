package com.OOPsConcepts;

public class NonStaticBlock {
	
	int a;
	
	NonStaticBlock() {
		System.out.println("Non-static Constructor");
	}
	
	//Non-static Intialisation Block

	{
		a=345;
		System.out.println("Non-static Block1 a= "+a);
	}
	
	{
		a=34589;
		System.out.println("Non-static Block2 a= "+a);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main Starts");
		NonStaticBlock N= new NonStaticBlock();
		NonStaticBlock N1=new NonStaticBlock();
		System.out.println("Main Ends");

	}

}

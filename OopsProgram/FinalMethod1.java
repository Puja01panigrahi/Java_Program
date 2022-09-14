package com.OopsProgram;

public class FinalMethod1 extends FinalMethod {
	
	//final method can be inherited but can't be overriden
	
	
public  void Test1() {
		
		System.out.println("Test1 in Finalmethod1 class");
	}

	public static void main(String[] args) {
		
		FinalMethod1 f=new FinalMethod1();
		f.Test1();

	}

}

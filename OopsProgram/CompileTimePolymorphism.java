package com.OopsProgram;

public class CompileTimePolymorphism {
	
	public int add(int a,int b) {
		
		return a+b;
	}
	
public double add(double a,double b) {
		
		return a+b;
	}

	public static void main(String[] args) {
		
		CompileTimePolymorphism C = new CompileTimePolymorphism();
		System.out.println(C.add(35, 78));
		System.out.println(C.add(234, 345));

	}

}

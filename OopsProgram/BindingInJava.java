package com.OopsProgram;

public class BindingInJava extends B112 {
	
	public static void main(String[] args) {
		B112 a= new C112();
		//Method call
		a.m1();
		a.m2();
		//a.m3();
		
		//Downcasting in Java
		if(a instanceof C112) {
			
			C112 C=(C112)a;
			C.m3();
			C.m1();
			C.m2();
		}
		
	}
}
 class A112 {
	 
	 //Method implimentation
	public static void m1() {
		
		System.out.println("M1 method");
	}
}
class B112 extends A112{
	
public static void m2() {
		
		System.out.println("M2 method");
	}
}
class C112 extends B112{
	
public static void m3() {
		
		System.out.println("M3 method");
	}
}
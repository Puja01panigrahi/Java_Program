package com.JavaProgram;

import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		int Num=sc.nextInt();
		
		int fact=1;
		
		for(int i=1;i<=Num;i++) {
		fact=fact*i;
		}
		
		System.out.println("The factorial of number " +Num + " is " + fact);
	}

}

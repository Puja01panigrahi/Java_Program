package com.JavaProgram;

import java.util.Scanner;

public class MultipleCondition2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		
		if(a%2==0 && a%4==0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Enter the Odd");
		}
	}

}

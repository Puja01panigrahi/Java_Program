package com.JavaProgram;

import java.util.Scanner;

public class EvenAndOdd {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		
		int Num=sc.nextInt();
		 
		if(Num%2==0) {
			System.out.println("Number is Even");
		}

		else {
			System.out.println("Number is odd");
		}
	}

}
 
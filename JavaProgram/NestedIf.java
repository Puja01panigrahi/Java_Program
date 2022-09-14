package com.JavaProgram;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		
		if(a%2==0 ) {
			
			if(a%5==0) {
				System.out.println("Number is divisible by 2 and 5");
			}
			else {
				System.out.println("Number is divisible by 2 only");
			}
		}
			else {
				System.out.println("Number is not divisible by 2 and 5");
			}
		}
	}



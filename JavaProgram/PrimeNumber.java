package com.JavaProgram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		int Num=sc.nextInt();
		int i=2;
		
		while(i<Num) {
			
			if(Num%i==0) {
				break;
			}
			i++;
		}
		if(i==Num) {
			System.out.println("Number is Prime number");
		}
		else
			System.out.println("Number is not Prime number");	
		
	}

}

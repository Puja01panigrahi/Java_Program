package com.JavaProgram;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		int Num=sc.nextInt();
		
		int a=Num;
		int sum=0;
		
		while (Num>0) {
			int r=Num%10;
			sum=sum+r;
			Num=Num/10;
		}
		System.out.println("The sum of number " +a+ " is " + sum);
	}

}

package com.JavaProgram;

import java.util.Scanner;

public class FibonaciSeries {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number");
		int a=sc.nextInt();
		
		System.out.println("Enter the 2nd number");
		int b=sc.nextInt();
		
		System.out.println("Enter the series number");
		int Num=sc.nextInt();
		
		System.out.print(a + " ");
		System.out.print(b + " ");
		
		for(int i=1;i<=Num;i++) {
			int c=a+b;
			System.out.print(c + " ");
			a=b;
			b=c;
		}
		
		
		
		

	}

}

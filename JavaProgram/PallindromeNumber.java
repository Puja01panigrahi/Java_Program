package com.JavaProgram;

import java.util.Scanner;

public class PallindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		int Num=sc.nextInt();
		int a=Num;
		int sum=0;
		
		while(Num>0) {
			int r=Num%10;
			sum=sum*10+r;
			Num=Num/10;	
		}
		
		if(a==sum) {
		
		System.out.println("The number is Pallindrome");
		}
		else{
			
			System.out.println("The number is not Pallindrome");
			}

	}

}

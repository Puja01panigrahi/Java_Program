package com.JavaProgram;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		int Num=sc.nextInt();
		int a=Num;
		int sum=0;
		
		while(Num>0) {
			int r=Num%10;
			sum=sum+r*r*r;
			Num=Num/10;
		}
		if(a==sum ) {
			System.out.println("Number is Pallindrome")	;
			}
		else
			System.out.println("Number is not Pallindrome")	;
	}
	

}

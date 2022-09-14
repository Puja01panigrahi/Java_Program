package com.JavaProgram;

import java.util.Scanner;

public class WhileLoop1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start number");
		int Start= sc.nextInt();
		int Num=Start;
		
		System.out.println("Enter the end number");
		int End= sc.nextInt();
		
		while(Num<=End) {
			System.out.println("Num : " +Num);
			Num++;
		}
		

	}

}

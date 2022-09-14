package com.JavaProgram;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start number");
		int Start= sc.nextInt();
		
		System.out.println("Enter the end number");
		int End= sc.nextInt();
		
		do {
			System.out.println(Start);
			Start++;
		}
		while(Start<=End);
		

	}

}

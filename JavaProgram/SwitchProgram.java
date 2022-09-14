package com.JavaProgram;

import java.util.Scanner;

public class SwitchProgram {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Days");
		int Months=sc.nextInt();
		
		switch (Months) {
		
		case 1 :
		case 12:
		case 2 :
			System.out.println("Winter Seasons");
			break;
		
		case 4 :
		case 5:
		case 6 :
			System.out.println("Summer Seasons");
			break;
			
		case 7 :
		case 8:
		case 9 :
			System.out.println("Rainy Seasons");
			break;
			
		default :
			System.out.println("Invalid Input");
			
		}

	}

}

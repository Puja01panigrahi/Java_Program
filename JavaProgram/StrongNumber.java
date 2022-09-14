package com.JavaProgram;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {

       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the number");
       int Num=sc.nextInt();
       
       int a=Num;
       int sum=0;
  
       while(Num>0 ) {
    	   
    	  int r=Num%10;
    	  int fact=1;
    	 
    	  for(int i=1;i<=r;i++) {
    		  fact=fact*i;
    	  }
    	  sum=sum+fact;
          Num=Num/10;
	}
       if(a==sum) {
    	   System.out.println("Number is strong number");
       }
       else
    	   System.out.println("Number is not a strong number");

}

}
package com.OopsProgram;

public class FestivalBonus extends Employee1 {
	

	
	public void sal() {
		double sal=52345.678;
		System.out.println(sal);
		System.out.println(super.sal);
	   super.sal();
	}

	public static void main(String[] args) {
		
		FestivalBonus F= new FestivalBonus();
		F.sal();
		

	}

}

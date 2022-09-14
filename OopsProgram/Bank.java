package com.OopsProgram;

//Example of Polymorphism

public class Bank {
	
	float getrateofinterest() {
		return 0;
	}
}

class Sbi extends Bank{
	
	float getrateofinterest() {
		
		return 8.4f;
	}
}

class Axis extends  Bank {
	
	float getrateofinterest() {
		
		return 7.4f;
	}
	
}

class Hdfc extends Bank {

	float getrateofinterest() {
	
	return 9.4f;
}
}
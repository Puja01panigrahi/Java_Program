package com.OopsProgram;

public class Address {

	String Country;
	String City;
	String State;
	
	public  Address(String Country,String State ,String City) {
		this.Country=Country;
		this.City=City;
		this.State=State;
		
	}
	
	public String displayAd() {
		return "[Country : " +Country+" , City : "+City+", State : "+State+"]";
	}

}

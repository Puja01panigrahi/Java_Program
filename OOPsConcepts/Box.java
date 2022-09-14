package com.OOPsConcepts;


//Main present in TestClass


public class Box {
	
	int Length;
	int Width;
	int Height;
	
	Box(){
		
	}
	
	Box(int L){
		
		Length=Height=Width=L;
	}
	
	public Box(int Length,int Width,int Height) {
		
		this.Height=Height;
		this.Length=Length;
		this.Width=Width;
	}
	
	public void display() {
		
		System.out.println("[Length :-"+Length+",Width :-"+Width+".Height :-"+Height+"]");
	}

}

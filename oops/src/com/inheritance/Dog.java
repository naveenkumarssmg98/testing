package com.inheritance;

class Dog extends Animal {
	String colour;
	Dog(int height,int weight,String colour)
	{
		super(height,weight);
		this.colour=colour;	
	}
	public static void main(String[] args) {
		
	Dog d1=new Dog(22,27,"Black");
	System.out.println("Dog's Height is "+d1.height+"Weight is "+d1.weight+"colour is"+d1.colour);
	}
}

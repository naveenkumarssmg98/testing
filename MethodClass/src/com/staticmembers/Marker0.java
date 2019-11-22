package com.staticmembers;

class Marker0 {

	 static int price;
	 static String colour;
	 
		  static void writing()
		  {
			  System.out.println("marker of colour "+colour+" is writing");
			  
		  }
		  public static void main(String[] args)
		  {
		  System.out.println(Marker0.price);
		  System.out.println(Marker0.colour);
		  Marker0.price=100;
		  Marker0.colour="Black";
		  Marker0.price=80;
		  Marker0.colour="Blue";
		  System.out.println("Marker of colour is "+Marker0.colour+" and Marker price is "+Marker0.price);
		 writing();	  
	 }
}


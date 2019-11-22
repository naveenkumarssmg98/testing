package com.methodoverriding;

 class MainClass1 {
	 public static void main(String[] args) {
		Circle c=new Circle();
		c.area();
		Rectangle r=new Rectangle();
		r.area();
		Shape s=new Shape();
		s.area();
		
	}
}

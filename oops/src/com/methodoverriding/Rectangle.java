package com.methodoverriding;

class Rectangle extends Shape {
	void area() {
		int length=13;
		int breadth=12;
		System.out.println(length*breadth);
	}
}

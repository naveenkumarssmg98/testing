package com.methodoverriding;

class Circle extends Shape {
	void area() {
		int r=2;
		double a=3.142*r*r;
		System.out.println(a);
	}
}

package com.staticmembers;
//demo program for static variables
class Demo03 {

static int i=10;
	public static void main(String[] args) {
	System.out.println(Demo03.i);
	Demo03.i=25;
	System.out.println(Demo03.i);

	}

}

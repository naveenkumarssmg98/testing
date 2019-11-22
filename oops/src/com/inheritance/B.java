package com.inheritance;

class B extends A {
	static int i=100;
	int j=200;
	static
	{
		System.out.println("from sib of B");
	}
	{System.out.println("from iib of B ");
	}
	B()
	{
		System.out.println("from B");
	}
public static void main(String[] args) {
	B ob1=new B();
	System.out.println(ob1.y);
	System.out.println(ob1.j);
	System.out.println(B.x);
	System.out.println(B.i);
	}
}
 

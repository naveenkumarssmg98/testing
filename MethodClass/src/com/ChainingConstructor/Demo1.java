package com.ChainingConstructor;

class Demo1 {
	{
		System.out.println("From IIB");
	}
Demo1()
{
	System.out.println("From demo1()");
}

Demo1(int X)
{
	this();
	System.out.println("From demo1(int x)");
}
Demo1(double y){
	this(100);
	System.out.println("From demo1(double y)");
}
public static void main(String[] args) {
	Demo1 P1=new Demo1();
	Demo1 P2=new Demo1(120);
	Demo1 P3=new Demo1(12.5);
	System.out.println("main ends");
}
}
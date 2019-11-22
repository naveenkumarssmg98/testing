package com.staticmembers;
class Demo012 {

	static boolean j;
static
{
	System.out.println("From sib of Demo12");
}
public static void main(String[] args)
{
	System.out.println("From main of Demo12");
	System.out.println(Demo011.i);
}
}


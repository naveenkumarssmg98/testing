package com.staticmembers;

class Demo010 {

static int i;
static 
{
	System.out.println("From sib");
	System.out.println(i);
	i=20;
}
	public static void main(String[] args) {
		System.out.println("From main");
		System.out.println(i);

	}

}


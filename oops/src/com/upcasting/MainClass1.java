package com.upcasting;

class MainClass1 {
	public static void main(String[] args) {
		B1 ob1=new C1();
		System.out.println(ob1.i);
		System.out.println(ob1.j);
		//System.out.println(ob1.k);
		A1 ob2=new C1();
	System.out.println(ob2.i);
		//System.out.println(ob2.j);
		//System.out.println(ob2.k);	
	A1 ob3=ob1;
	System.out.println(ob3.i);
		//System.out.println(ob3.j);
		//System.out.println(ob3.k);
	
	
}
}
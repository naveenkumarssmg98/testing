package com.upcasting;

class MainClass{
	public static void main(String[] args) {
		A ob1=new B();		//up-casting
		System.out.println(ob1.i);
		//System.out.println(ob1.j);// USING PARENT TYPE REFERENCE WE CAN'T ACCESS MEMBERS OF CHILD CLASS
		
		B ob2 = new B();
		A ob3= ob2;			//up-casting
		System.out.println(ob2.i);
		System.out.println(ob2.j);
		System.out.println(ob3.i);
	//	System.out.println(ob3.j);USING PARENT TYPE REFERENCE WE CAN'T ACCESS MEMBERS OF CHILD CLASS
	}

}

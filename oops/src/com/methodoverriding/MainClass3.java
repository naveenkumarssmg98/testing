package com.methodoverriding;

class MainClass3 {
	public static void main(String[] args) {
		
		A ob1=new A();
		ob1.test();
		
		B ob2=new B();
		ob1.test();
		C ob3=new C();
		ob3.test();
	}

}



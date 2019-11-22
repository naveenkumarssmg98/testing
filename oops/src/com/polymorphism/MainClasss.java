package com.polymorphism;

	class MainClasss {
		public static void main(String[] args) {
			A ob;
			ob=new A();
			ob.test();
			ob=new B();		// upcasting
			ob.test();		// polymorphism
		}

}

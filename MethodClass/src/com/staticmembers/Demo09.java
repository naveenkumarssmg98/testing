package com.staticmembers;

class Demo09 {

	static {
		System.out.println("sib-2");
	}

	public static void main(String[] args) {
		System.out.println("From main");
	}
	static {
		System.out.println("sib-1");
	}

}


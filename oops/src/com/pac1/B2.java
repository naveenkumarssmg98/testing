package com.pac1;
//access default members from diff class, same pack -possible


public class B2 {
	
	public static void main(String[] args) {
		A2 ob=new A2();
		System.out.println(A2.i);
		System.out.println(ob.j);
		
	}

}

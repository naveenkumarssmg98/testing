package com.pac1;
//to access protected members from same class--possible


 public class A3 {

	
		protected static int i;
		protected int j;
		
		public static void main(String[] args) {
			
			A3 ob =new A3();
			System.out.println(i);
			System.out.println(ob.j);
			
		}
		
		
		
		

	}

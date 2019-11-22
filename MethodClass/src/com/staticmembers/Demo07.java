package com.staticmembers;

 class Demo07 {
		static void m1(){
			System.out.println("from static method m1 of Demo7");
		}
		public static void main(String[] args) {
			m1();
			Demo07.m1();
			
		}

	}




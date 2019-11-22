package com.downcasting;

class MainClass {

		public static void main(String[] args) {
			A ob1=new A(10);
			display(ob1);
			B ob2=new B(100,200);
			display(ob2);
			C ob3=new C(21,14,54);
			display(ob3);
		}
		static void display(A obj)
		{
			System.out.println(obj.i);
			if(obj instanceof B )
			{
				B obj2=(B)obj;
				System.out.println(obj2.j);
			}

			if(obj instanceof C) {
				C obj3=(C)obj;
				System.out.println(obj3.k);
			}
			System.out.println("****");
		}

	}



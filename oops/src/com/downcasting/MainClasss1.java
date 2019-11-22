package com.downcasting;

class MainClasss1 {

		public static void main(String[] args) {
			A ob1=new A(10);
			display(ob1);
			B ob2=new B(100,200);
			display(ob2);

		}
		static void display(A obj)
		{
			System.out.println(obj.i);
			if(obj instanceof B )
			{
				B obj2=(B)obj;
				System.out.println(obj2.j);
			}

			System.out.println("****");
		}

	}



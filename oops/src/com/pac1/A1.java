package com.pac1;
//private  access specifier same class


 public class A1 {
	private static int i;
	 int j;
	A1()
	{
	
	}
	private A1(int i)
	{
		this.i=i;
	}
	
	public static void main(String[] args)
	
	{
		 A1 ob =new A1(10);//can access private members within the same class
		System.out.println(i);
		 System.out.println(ob.j);
		 
		
	

	
		
	}

}

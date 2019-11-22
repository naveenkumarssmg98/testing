package com.pac1;
//to access private members in sub class-not possible

public class C1 extends A1{
	C1()
	{
	
	
	}
	/*C1(int i)     
	{
		super(i);   error private constructor is not accessiblr in sub class
	*/

	public static void main(String[] args) {
		A1 ob=new A1();
		
		System.out.println(ob.j);
		//System.out.println(A1.i);  error i is private so not accessible
		
		
		// TODO Auto-generated method stub

	}

}

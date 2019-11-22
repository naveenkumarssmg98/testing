package com.Miscellaneous;

class A {
int i;
double j;
A(int i,double j){
	this.i=i;
	this.j=j;
}
   static void display(A ob) {
	   System.out.println(ob.i);
	   System.out.println(ob.j);
	   
   }
   public static void main(String[] args) {
	A ob1=new A(10,20.2);
	display(ob1);
	
	
}
}

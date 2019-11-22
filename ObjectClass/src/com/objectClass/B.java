package com.objectClass;

public class B extends A1 {
char ch;
String s;
B(){}
B(int i,double j,char ch,String s)
{
	super(i,j);
	this.ch=ch;
	this.s=s;
}
public String toString()
{
return super.toString()+" "+ch+" "+s;	
}
public static void main(String[] args) {
	A1 ob1=new A1(10,300.0);
	B ob2=new B(20,200.0,'a',"sdfghjk");
	System.out.println(ob1);
	System.out.println(ob2);
	A1 [] a= {new A1(10,300.0),new A1(10,300.0),new A1(10,300.0)};
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(a[2]);
}
}

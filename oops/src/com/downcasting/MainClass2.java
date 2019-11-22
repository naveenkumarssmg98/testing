package com.downcasting;

class MainClass2 {
	public static void main(String[] args) {
	A ob1=new A(10);
	display(ob1);
	D ob2=new D(1000,2000);
	display(ob2);

}
static void display(A obj)
{
	System.out.println(obj.i);
	if(obj instanceof D )
	{
		D obj2=(D)obj;
		System.out.println(obj2.l);
	}

	System.out.println("****");
}

}


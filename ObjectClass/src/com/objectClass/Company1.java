package com.objectClass;

public class Company1 {

	
	public static void main(String[] args) {

	
		TestEngineer t1=new TestEngineer(1,"Naveen",10.0,"Buggini");
		TestEngineer t2=new TestEngineer(1,"Naveen",10.0,"Jira");
		Developer d1=new Developer(1,"Naveen",10.0,"java");
		Developer d2=new Developer(1,"Naveen",10.0,"java");
	     System.out.println(t1);
	     System.out.println(t2);
	     System.out.println(t1.equals(t2));
	     System.out.println(t2.equals(t1));
	     System.out.println(t1.hashCode());
	     System.out.println(t2.hashCode());
	     System.out.println(d1.hashCode());
	     System.out.println(d2.hashCode());

		

	}

}


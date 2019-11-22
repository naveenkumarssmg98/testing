package com.objectClass;


public class Company {
	public static void main(String[] args) {
		Emp e1=new Emp(2,"ghdk",20000);
		Emp[] e= {new Emp(3,"kjh",30000),new Emp(4,"jhgf",40000)};
		System.out.println(e[0]);
		System.out.println(e[1]);
		System.out.println(e1);
	}

}


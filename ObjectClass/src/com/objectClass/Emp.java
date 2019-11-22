package com.objectClass;

class Emp{
	 int id;
	 String name;
	 double salary;
	 Emp()
	 {
		 
	 }
	 Emp(int id,String name,double salary)
	 {
		this.id =id;
		this.name=name;
		this.salary=salary;
	 }
	 public String toString()
	 {
		 return id+" "+name+" "+salary;
	 }
	 public boolean equals(Object ob)
	 {
		 Emp temp=(Emp)ob;
		 return this.id==temp.id && this.name==temp.name && this.salary==temp.salary;
	 }
	 public int hashCode()
	 {
		 int hc=id+name.hashCode()+(int)salary;
		 return hc;
		 
	 }

}


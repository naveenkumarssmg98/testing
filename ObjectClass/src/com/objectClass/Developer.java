package com.objectClass;

 class Developer extends Emp {
		 String language;
		 Developer()
		 {
			 
		 }
		 Developer(int id,String name,double salary,String language)
		 {
			 super(id,name,salary);
			 this.language=language;
			 
		 }
		 public String toString()
		 {
			 return super.toString()+" "+language;
		 }
		 public boolean equals(Object ob)
		 {
			 Developer temp=(Developer)ob;
			 return super.equals(ob) && this.language==temp.language;
		 }
		 public int hashCode()
		 {
			 int hc=super.hashCode()+language.hashCode();
			 return hc;
			 
		 }
		 }


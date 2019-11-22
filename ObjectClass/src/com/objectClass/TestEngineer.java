package com.objectClass;

		 class TestEngineer extends Emp{
			 String tool;
			 TestEngineer()
			 {
				 
			 }
			 TestEngineer(int id,String name,double salary,String tool)
			 {
				 super(id,name,salary);
				 this.tool=tool;
				 
			 }
			 public String toString()
			 {
				 return super.toString()+" "+tool;
			 }
			 public boolean equals(Object ob)
			 {
				 TestEngineer temp=(TestEngineer)ob;
				 return super.equals(ob) && this.tool==temp.tool;
			 }
			 public int hashCode()
			 {
				 int hc=super.hashCode()+tool.hashCode();
				 return hc;
				 
			 }
			

		}



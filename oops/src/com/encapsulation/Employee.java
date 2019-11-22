package com.encapsulation;

	class Employee {
		private int id;
		private String name;
		private double salary;
		public Employee() {
			
		}
		public Employee(int id,String name,double salary)
		{
			this.id=id;
			this.name=name;
			this.salary=salary;
		}
		public int getId() {
			return id;
		}
		public String getName() {
			return name; 
			
		}
		public void setSalary(double salary) {
			this.salary=salary;
		}
		public double readSalary() {
			return salary;
		}

}

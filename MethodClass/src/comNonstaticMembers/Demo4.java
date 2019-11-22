package comNonstaticMembers; 

class Demo4 {
	int i=10;
	public static void main(String[] args) {
		Demo4 ob=new Demo4();
		int i=20;
		System.out.println(i);
		System.out.println(ob.i); 
	}

}

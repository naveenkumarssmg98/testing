package comNonstaticMembers;

class MainClass {
public static void main(String[] args) {
	A ob1=new A();
	A ob2=new A();
	System.out.println(ob1);
System.out.println(ob2);
System.out.println(ob1.d);
System.out.println(ob2.d);
ob1.d=12.0;
System.out.println(ob1.d);
System.out.println(ob2.d);
ob1.d=30.0;
ob2.d=40;
System.out.println(ob1.d);
System.out.println(ob2.d);
}

}

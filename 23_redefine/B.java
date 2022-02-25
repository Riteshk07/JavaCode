class A {
	static int x=2;
}
class B extends A{
	static int x=5;
}
class X {
	public static void main (String[]args){
		A a = new B();
		System.out.println(a.x);
	}
}
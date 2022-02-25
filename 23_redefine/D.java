class A {
	static void pro(){
        System.out.println(45);
    }
}
class B extends A{
	static void pro(){
        System.out.println(12);
    }
}
class X {
	public static void main (String[]args){
		A a = new B();
		a.pro();
	}
}
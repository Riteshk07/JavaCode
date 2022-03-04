class A {
	static int i;
	A(){
		i++;
	}
	public static void main (String[]args){
		A a1 = new A();
		A a2 = new A();
		A a3 = new A();
		A a4 = new A();
		System.out.println(a1.i);
		System.out.println(a2.i);
		System.out.println(a3.i);
		System.out.println(a4.i);
	}
}
class A {
	final int x = 80;
	public static void main (String [] args){
		A a = new A();
		System.out.println(a.x);
		
		a.x=88;      // error: cannot assign a value to final variable x
	}
}
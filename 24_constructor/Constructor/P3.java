class A {
	static final int x;

	A(){
		x=56;
	}

	public static void main (String[]args){
		new A();
		new A();
	}
}
// error: cannot assign a value to final variable y
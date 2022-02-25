interface B {}

class A implements B {}

class X {
	public static void main (String[]args){
		// case 3:
		// B x = new A();
		

		// case 2:
		// new B ();       // B is abstract; cannot be instantiated

		// case 1:
		B x;
	}
}
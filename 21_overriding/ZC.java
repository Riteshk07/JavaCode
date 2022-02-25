class A {
	static void pro(){
		System.out.println("Pro in A");
	}
}

class B extends A {
	static void pro(){
		System.out.println("Pro in B");
	}
}

class X {
	public static void main (String[]args){
		// Case 1
		// A x = new A ();

		// Case 2 
		// B x = new B();

		// case 3 
		A x = new B();

		// Runtime polymorphism
		x.pro();   // compiler replace x to A because it's method is static
	}
}
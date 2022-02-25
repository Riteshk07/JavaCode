class A {
	void pro(){
		System.out.println("Pro in A");
	}
}

class B extends A {
	void pro(){
		System.out.println("Pro in B");
	}
}

class X {
	public static void main (String[]args){
		// Case 1
		A x = new A ();

		// Case 2 
		// B x = new B();

		// case 3 
		// A x = new B();

		// Runtime polymorphism
		x.pro();    // Dynamic method dispatch
	}
}
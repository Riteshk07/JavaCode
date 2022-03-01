class A {
	A(int x ){
		System.out.println("Hello JI");
	}
}

class X {
	public static void main (String[]args){
		new A ();
	}
}


// error: constructor A in class A cannot be applied to given types;
//                 new A ();
//                 ^
//   required: int
//   found: no arguments
//   reason: actual and formal argument lists differ in length
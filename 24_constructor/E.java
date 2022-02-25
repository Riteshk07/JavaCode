class A {
	A(int x){
		System.out.println("hello");
	}
}

class B extends A {
	public static void main (String[]args){
		B x = new B();
	}
}
/*
class B extends A {
^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
1 error
*/
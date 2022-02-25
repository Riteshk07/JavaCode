class A{
	// overridden method
	private void pro(){
		// some code
	}
}

class B extends A {
	// overriding method 
	// void pro(){
		// some code 
	// }

	public static void main (String[]args){
		B x = new B();
		x.pro();   // error: cannot find symbol
	}
}
// private method/variable not accessible in other class 
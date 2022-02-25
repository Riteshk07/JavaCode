class A{
	// overridden method
	final void pro(){
		// some code
	}
}

class B extends A {
	// overriding method 
	void pro(){
		// some code 
	}
}

// error: pro() in B cannot override pro() in A
// overridden method is final
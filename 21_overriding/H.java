class A {
	void pro(int x){
		// some code 
	}
}

class B extends A {
	// parameter TYPE mismatch... legal case of method is overloading
	// not a legal case of method overrinding... because parameter body of 
	// overriding method must match with the parameter body of overridden method 
	void pro(long x){
		// some code 
	}
	
}
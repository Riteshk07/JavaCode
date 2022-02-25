class A {
	void pro(){
        // some code 
    }
}

class B extends A {
	// parameter COUNT mismatch... legal case of method is overloading
	// not a legal case of method overrinding... because parameter body of 
	// overriding method must match with the parameter body of overridden method 
	void pro(int y){
		// some code 
	}
	
}
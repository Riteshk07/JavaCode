class A{
	// overridden method
	private void pro(){
		// some code
	}
}

class B extends A {
	// not overriding, because the parent class method version is private.
    	// the first condition says that the method must be inherritable to child and non final.
    	// this is just a coincidence that the child defined a method with the same name ...
	void pro(){
		// some code 
	}

}


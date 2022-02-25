class A {
	void pro(){
		// some code 
	}
}

class B extends A {
	int pro(){
		//some code 
	}
}

// error: pro() in B cannot override pro() in A

// return type int is not compatible with void 
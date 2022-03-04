class A {
	A(int x ){
	
		this();
	}
	A(){
		this(12);      // error: recursive constructor invocation
	}
}
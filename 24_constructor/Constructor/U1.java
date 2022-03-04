class A {
	A(){
		super();
		this(12);       // error: call to this must be first statement in constructor
	}
	A(int x){
		
	}
}

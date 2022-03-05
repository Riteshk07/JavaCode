class X {
	X(A x){
		
	}
}
class A extends X {
	static {System.out.println(this);}  //error: non-static variable this cannot be referenced from a static context
	
	static void pro(){System.out.println(this);}    //error: non-static variable this cannot be referenced from a static context

	A(){
		super(this); 	// error: cannot reference this before supertype constructor has been called
		System.out.println(this);
	}
}
class X {
	void pro1(){
	
	}
	final void pro2(){
	
	}	
}
class A extends X {
	void pro1(){
	
	}
	
	// error: pro2() in A cannot override pro2() in X
   	// overridden method is final
	void pro2(){
	
	}
}
class A {
	void pro(){
		// method local inner class 
		class B {
			
		}
	}
	public static void main (String [] args){
		A x = new A();
		x.pro();
	}
}
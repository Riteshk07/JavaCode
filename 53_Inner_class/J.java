class A {
	void pro(){
		B y = new B();
		// Method local inner class 
		class B {
			int n= 90;
			void info(){
				System.out.println("Badiya Boss");
			}
		}
		
		
	}
	public static void main(String [] args){
		A a = new A();
		a.pro();
	}
}
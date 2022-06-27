class A {
	void pro(){
		// Method local inner class 
		class B {
			int n= 90;
			void info(){
				System.out.println("Badiya Boss");
			}
		}
		
		B y = new B();
		System.out.println(y.n);
		y.info();
	}
	public static void main(String [] args){
		A a = new A();
		a.pro();
	}
}
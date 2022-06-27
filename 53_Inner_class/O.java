class A {
	int y = 9;
	
	void info(){
		System.out.println("Hii");
	}
	
	static void pro(){
		class B{
			void abc (){
				System.out.println("y");
				info();
				// error: non-static method info() cannot be referenced from a static context
			}
		}
		B w = new B();
		w.abc();
	}
	public static void main (String [] args){
		A t = new A();
		t.pro();
	}
}
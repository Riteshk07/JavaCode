class A{
	// Instance level variable
	int y = 13;
	
	// Instance level method
	void pro(){
		System.out.println(y);
		info();
		X x = new X();
		System.out.println(x);
	}
	
	// Instance level method
	void info(){
		System.out.println("Hi");
	}
	
	// Instance level class
	class X{
		
	}
	// static mehtod
	public static void main (String [] args){
		
		
		A obj = new A();
		// X x = new X();
		X x = obj.new X();
		A.X y = obj.new X();
		obj.pro();
	}
}
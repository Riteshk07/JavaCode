class A{
	// Instance level variable
	int x = 56;
	
	// Instance level method
	void pro(){
		System.out.println("Hello");
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
	}
}
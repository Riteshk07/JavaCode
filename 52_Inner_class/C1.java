class A{
	// Instance level variable
	int x = 56;
	
	// Instance level method
	void pro(){
		System.out.println("Hello");
	}
	
	// Instance level class
	class B{
		
	}
	// static mehtod
	public static void main (String [] args){
		
		// case 2
		A obj = new A();
		System.out.println(obj.x);
		obj.pro();
		
		// case 1
		// System.out.println(x);
		System.out.println(new A().x);
		// pro()
		new A().pro();
	}
}
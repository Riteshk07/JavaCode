class A {
	class X{
		
	}
	
	public static void main (String [] args){
		A a = new A();
		// X x= new X(); // not ok
		X x = a.new X();
		A.X y = a.new X();
	}
}
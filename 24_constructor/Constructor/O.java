abstract class A{
	A(){
		System.out.println("Hello ji");
	}
}

class X extends A{
	public static void main(String[]args){
		// new A();    // error: A is abstract; cannot be instantiated
                    //    new A();
                    //    ^     
		new X();
	}
}
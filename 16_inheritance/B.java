// if you forget to declare a parent class then 
// objact class will be the parent class.
// here you can access the member of parent class.
// object using the object of child class(A).

class A {
	void pro(){
		System.out.println("Thaggde Le");
	}
	public static void main(String[]args){
		A x = new A();
		x.pro();
		// x.abc();
		System.out.println(x.hashCode());
		System.out.println(x.toString());
		// System.out.println(x.clone());              //error: unreported exception CloneNotSupportedException; must be caught or declared to be thrown
		// System.out.println(x.finalize());           //error: 'void' type not allowed here
		System.out.println(x.getClass());
		// System.out.println(x.notify());             //error: 'void' type not allowed here
        // Note: B.java uses or overrides a deprecated API.    
        // Note: Recompile with -Xlint:deprecation for details.
        // System.out.println(x.wait());               //error: 'void' type not allowed here
	}
}
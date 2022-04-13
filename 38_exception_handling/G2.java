class X{
	X() throws ClassNotFoundException {
		Class.forName("Golu");
		System.out.println("A");
	}
}

class A extends X {
	//error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
	A() {
		
	}
	
	public static void main(String[] args) {
		System.out.println("C");
		A a = new A();
		System.out.println("B");
	}
}
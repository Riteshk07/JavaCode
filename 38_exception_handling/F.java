class X{
	X() {
		Class.forName("Golu");  // error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
		System.out.println("A");
	}
}

class A extends X {
	public static void main(String[] args) {
		System.out.println("C");
		A a = new A();
		System.out.println("B");
	}
}
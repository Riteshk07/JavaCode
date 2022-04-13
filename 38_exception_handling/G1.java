class X{
	X() throws ClassNotFoundException {
		Class.forName("Golu");
		System.out.println("A");
	}
}

// error: unreported exception ClassNotFoundException in default constructor
class A extends X {
	public static void main(String[] args) {
		System.out.println("C");
		A a = new A();
		System.out.println("B");
	}
}
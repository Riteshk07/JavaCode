class A {
	public static void main(String[] args) {
		System.out.println("A");
		pro();
	}

	static void pro() throws ClassNotFoundException {
		System.out.println("B");	
		info();
	}

	static void info() throws ClassNotFoundException {
		System.out.println("C");
		Class.forName("Golu");
	}
}

// error: unreported exception ClassNotFoundException; must be caught or declared to be thrown
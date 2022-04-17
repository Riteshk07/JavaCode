class A extends Exception {
	public static void main(String[]args){
		throw new A();  // trying to throw a checked Exceptiion
	}// error: unreported exception A; must be caught or declared to be thrown
}
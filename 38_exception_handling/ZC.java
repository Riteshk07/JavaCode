class A {
	public static void main (String[]args){
		if(12>13){
			throw new ArithmeticException();
			System.out.println("N");	// error: unreachable statement
		}
		System.out.println("A");
	}
}
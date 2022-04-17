class A{
	public static void main (String[]args){
		if (12<13){
			throw new ArithmeticException();
		}// reachable Statement
		
		System.out.println("A");
	}
}
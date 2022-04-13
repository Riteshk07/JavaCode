class A{
	public static void main (String[]args){
		int u = 45/0;	// Unchecked exception ArithmeticException generating code...
		
		// compiler not going to check whether you are handling the exception or declaring it...
	}
}

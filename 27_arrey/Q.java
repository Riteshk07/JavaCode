class A{
	static int[]x;    	// it is initialized by null
	public static void main (String[]args){
		System.out.println(x[0]);
	}
}
	// Failure : NullPointerException
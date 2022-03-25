class A {
	public static void main (String[]args){
		String x = "Mohan is my friend";

		// String []y = x.split(" ");
		String []y = x.split(" ", 3);
		for (String t : y){
			System.out.println(t);
		}
	}
}

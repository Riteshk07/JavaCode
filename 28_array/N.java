class A {
	public static void main (String[]args){
		int[][] x = new int  [2][];
		
		// x[0] = {12,34,56};
		x[0] = new int []{12,34,56};
		x[1] = new int[4];

		System.out.println(x[0].length);
		System.out.println(x[1].length);
	}
}

class A {
	public static void main(String[] args) {
		try {
			int[] x = {12, 13, 14};
			System.out.println(x[3]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("AIOBE");
		} catch(IndexOutOfBoundsException e) {
			System.out.println("IOBE");
		} 		
	}
}
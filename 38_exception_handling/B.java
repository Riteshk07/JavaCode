class A {
	public static void main(String[] args) {
		try {
			int[] x = {12, 13, 14};
			System.out.println(x[3]);
		} catch(IndexOutOfBoundsException e) {
			System.out.println("IOBE");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("AIOBE");
		}		
	}
}

// error: exception ArrayIndexOutOfBoundsException has already been caught
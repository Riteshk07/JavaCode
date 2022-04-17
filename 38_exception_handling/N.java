class A {
	public static void main (String[]args){
		System.out.println("A");
		try{
			System.out.println("B");
		}
		System.out.println("C");
		catch(ArithmeticException e ){
			System.out.println(e);
		}
		System.out.println("D");
		finally{
			System.out.println("F");
		}
		System.out.println("G");
	}
}
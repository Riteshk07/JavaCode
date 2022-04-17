class A{
	public static void main (String []args){
		try{
			int y = 12/0;
		}catch (ArithmeticException e){
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
/*
java.lang.ArithmeticException: / by zero
/ by zero
java.lang.ArithmeticException: / by zero
        at A.main(K.java:4)

*/
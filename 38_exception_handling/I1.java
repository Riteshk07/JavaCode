class A extends RuntimeException{
	public static void main (String []args){
		throw new A();  // trying to throw an unchecked Exception
	}
}
/*
Exception in thread "main" A
        at A.main(I1.java:3)

*/
class A{
	public static void main (String []args){
		if (args.length==0){
			throw new MissingCommandLineArgumentException();
		}
		System.out.println("A");
	}
}

class MissingCommandLineArgumentException extends RuntimeException{
	
}

/*
Exception in thread "main" MissingCommandLineArgumentException
        at A.main(L.java:4)

*/
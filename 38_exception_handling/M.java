class A{
	public static void main (String []args){
		if (args.length==0){
			throw new MissingCommandLineArgumentException("Argument Expected but not found");
		}
		System.out.println("A");
	}
}

class MissingCommandLineArgumentException extends RuntimeException{
	MissingCommandLineArgumentException(){
		
	}
	MissingCommandLineArgumentException(String message){
		super(message);
	}
}
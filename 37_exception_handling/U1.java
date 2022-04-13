class A{
	public static void main (String []args){
		try{
			Class kls = Class.forName("java.lang.String");
		}catch (ClassNotFoundException e){
			System.out.println("CNFE");
		}
	}
}

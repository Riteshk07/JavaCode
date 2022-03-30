class A{
	public static void main(String[]args){
		char y = 3;
		// short t =y; // // error: incompatible types: possible lossy conversion from short to short
		short t = (short)y;

        System.out.println(t);
	}
}

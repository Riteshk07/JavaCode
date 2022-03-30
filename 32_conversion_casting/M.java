class A{
	public static void main (String[]args){
		char x = 1;

		// byte y = x; // error: incompatible types: possible lossy conversion from char to byte

		byte y = (byte)x;
        System.out.println(y);
	}
}

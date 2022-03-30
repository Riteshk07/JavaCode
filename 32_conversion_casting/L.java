class A{
	public static void main (String []args){
		byte  a= 2;
		// char x = a; // error: incompatible types: possible lossy conversion from byte to char

		char x = (char)a;
        System.out.println(x);
	}
}

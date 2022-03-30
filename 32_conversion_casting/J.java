class A{
	public static void main (String[]args){
		int a = 2;
		// pro(a);     // error: incompatible types: possible lossy conversion from int to byte
		pro((byte)a);
		pro((byte)3);
	}
	static void pro(byte x){
		System.out.println(x);
	}
}
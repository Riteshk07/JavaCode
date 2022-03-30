class A{
	public static void main (String[]args){
		byte x = pro();
	}
	static byte pro(){
		int a = 2;
		return a;   // error: incompatible types: possible lossy conversion from int to byte
	}
}

class A{
	public static void main (String[]args){
		char a = 1;
		byte b = 1;

		short x = a+b;	// error: incompatible types: possible lossy conversion from int to short
	}
}
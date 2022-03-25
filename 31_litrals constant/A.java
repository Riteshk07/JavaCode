class A{
	public static void main(String[]args){
		int a = 5;
		while(bool(a)){
			System.out.print(a+" ");
			a-=1;
		}
	}
	public static boolean bool(int n){
		boolean t = n != 0;
		return t;
	} 
}
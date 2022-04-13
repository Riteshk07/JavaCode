class A{
	public static void main (String[]args){
        System.out.println("A");
		try{
			int x = 12/0;
			System.out.println(x);
		}catch(ArithmeticException a){
			System.out.println(a);
		}
        System.out.println("B");
	}
}
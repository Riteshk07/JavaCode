class A {
	{System.out.println(this);}
	
	A(){System.out.println(this);}
	
	void pro(){System.out.println(this);}

	public static void main (String[]args){
		A x = new A();
		System.out.println(x);
		x.pro();
	}
}
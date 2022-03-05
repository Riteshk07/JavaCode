
class A {
	{System.out.println(super);}
	
	A(){System.out.println(super);}
	
	void pro(){System.out.println(super);}

	public static void main (String[]args){
		A x = new A();
		System.out.println(x);
		x.pro();
	}
}

/*
super() ok
super.<member> ok
super not ok
*/
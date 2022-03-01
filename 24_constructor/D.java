class A {
	int x;
	void golu(){
		System.out.println("The Golu");
	}
	void bholi(){
		System.out.println("The Bholu");
	}
}

class B extends A{
	boolean t;
	char m = 'T';
	void kalia(){
		System.out.println("The Kalia");
}
	void chutki(){
		System.out.println("The Chutki");
	}
}
class X{
	public static void main(String[]args){
		new B().golu();
		new B().bholi();
		new B().kalia();
		new B().chutki();
		B x = new B();
		x.toString();
	}
}
class X {
	void pro(int a){
		System.out.println("pro Integer param "+a);
	}
	void pro(float a){
		System.out.println("pro float param "+a);
	}
}
class A{
	public static void main(String[]args){
		X x = new X();
		x.pro(9);
		x.pro(3.45f);
	}
}
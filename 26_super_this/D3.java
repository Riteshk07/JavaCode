class X {
	int t = 999;	
}
class A extends X {
	int t =333;
	void pro(){
		int t=777;
		System.out.println(t);
	}
	public static void main(String[]args){
		A x = new A();
		x.pro();
	}
}
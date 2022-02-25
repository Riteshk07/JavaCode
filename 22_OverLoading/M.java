class X{
	void pro(String y){
		System.out.println("pro String param "+ y);
	}
	void pro(X y){
		System.out.println("pro class param "+ y);
	}
}

class A  {
	public static void main(String[]args){
		X x = new X();
		x.pro(10);  //error: no suitable method found for pro(int)
	}
}
class A{
	A(char w){
		System.out.println(1);
		int y = 12/0;
		System.out.println(2);
	}
	A(int e){
		this ('a');
		System.out.println(3);
	}
	A(float r ){
		this (12);
		System.out.println(4);
	}
	public static void main (String []args){
		System.out.println(5);
		A x = new A(4.55f);
		System.out.println(6);
	}
}
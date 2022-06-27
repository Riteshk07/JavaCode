class A{
	int x = 56;
	
	void pro(){
		System.out.println("Hello");
	}
	
	public static void main (String [] args){
		// System.out.println(x);
		System.out.println(new A().x);
		
		// pro()
		new A().pro();
	}
}
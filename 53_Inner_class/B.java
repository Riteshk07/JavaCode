class A {
	static Z t = new Z(){
		void pro(){
			System.out.println("Technical Guru ji");
		}
	};
	public static void main (String [] args ){
		t.pro();
		Z y = new  Z();
		y.pro();
	}
}

class Z{
	void pro(){
		System.out.println("Guru ji.");
	}
}
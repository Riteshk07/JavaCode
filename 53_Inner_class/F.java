class A {
	private static float j = 452.56f;
	Z t = new Z(){
		void pro(){
			System.out.println(j);
		}
		void info(){	//  error: cannot find symbol
			System.out.println("Prithviraj");
		}
	};
	public static void main (String [] args ){
		A a = new A();
		a.t.pro();
		a.t.info();
		
		Z y = new Z();
		y.pro();
	}
}

class Z{
	void pro(){
		System.out.println("Guru ji.");
	}
}
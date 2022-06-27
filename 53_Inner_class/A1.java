class A {
	// Anonmous Inner class
	// An inner class of A 
	// and a sub class interface Z 
	static Z t = new Z(){
		public void pro(){
			System.out.println("Hello Ji...");
		}
	};
	public static void main (String [] args){
		t.pro();
	}
}

interface Z {
	void pro();
}

/*
class T implements Z{
	public void pro(){
		System.out.println("Hi....");
	}
}
*/
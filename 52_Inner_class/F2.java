class A {
	class T{
		
	}
}

class Z{
	void pro(){
		A x = new A();
		A.T t = x.new T();
	}
	
	public static void main (String [] args){
		Z z = new Z();
		z.pro();
	}
}
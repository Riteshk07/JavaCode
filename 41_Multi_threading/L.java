class X implements Runnable {
	public void run (){
		A.a.pro1();
	}
}

class Y implements Runnable {
	public void run (){
		A.a.pro2();
	}
}

class A {
	static Z a = new Z();
	
	public static void main (String[]args){
		Thread t1= new Thread(new X(), "A");
		Thread t2= new Thread(new Y(), "B");
		
		t1.start();
		t2.start();
	}
}

class Z{
	void pro1(){
		System.out.println("A");
		System.out.println("B");
		synchronized (this){
			for (int i=0; i<20; i++){
			System.out.println(i+"-"+Thread.currentThread().getName());
			}
		}
		System.out.println("C");
		System.out.println("D");
	}
	void pro2(){
		System.out.println("1");
		System.out.println("2");
		synchronized (this){
			for (int i=0; i<20; i++){
			System.out.println(i+"-"+Thread.currentThread().getName());
			}
		}
		System.out.println("3");
		System.out.println("4");
	}
}
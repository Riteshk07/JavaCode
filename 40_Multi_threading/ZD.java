class X extends Thread{
	public void run(){
		Thread t = Thread.currentThread();
		for (int i=0; i<1000; i++){
			System.out.println(i+"-"+getName());
		}
	}
}

class A{
	static Thread t;
	public static void main (String []args) throws InterruptedException{
		X x = new X();
		x.setName("A");
		x.start();
		x.join(100);
		Thread t = Thread.currentThread();
		for (int i=0; i<100; i++){
			System.out.println(i+"-"+t.getName());
		}
	}
}
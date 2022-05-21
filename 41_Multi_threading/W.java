class X extends Thread{
	public void run(){
		for (int i = 0; i<100; i++){
			System.out.println(Thread.currentThread().getName());
		}
	}
}

class A {
	public static void main (String[]args){
		X x = new X();
		x.setName ("A");
		x.setDaemon(true);
		x.start();
		for (int i = 0; i<5; i++){
			System.out.println(Thread.currentThread().getName());
		}
	}
}
class X extends Thread {
	public void run(){
		System.out.println("++++");
	}
}

class A {
	public static void main (String [] args) throws InterruptedException{
		X x = new X();
		x.setName("A");
		x.start();
		ThreadGroup tg = Thread.currentThread().getThreadGroup();
		tg.list();
		Thread.sleep(100);
		tg.list();
		
	}
}
class X extends Thread{
	public void run(){
		System.out.println("Ritesh");
	}
}

class A {
	public static void main (String [] args) throws InterruptedException{
		X x = new X();
		x.setName("AA");
		x.start();
		ThreadGroup tg = Thread.currentThread().getThreadGroup();
		//tg.list(); 
		System.out.println(tg.activeCount());
		Thread.sleep(100);
		//tg.list();
		System.out.println(tg.activeCount());
		
	}
}
class X extends Thread{
	public void run(){
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+"-"+t.isDaemon());
		Y y = new Y();
		y.setName("B");
		y.setDaemon(false);
		y.start();
	}
}

class Y extends Thread{
	public void run(){
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+"-"+t.isDaemon());
	}
}

class A {
	public static void main (String[]args){
		X x = new X();
		x.setName("A");
		x.setDaemon(true);
		x.start();
		try{Thread.sleep(1000);}catch(InterruptedException e ){e.printStackTrace();}
		for (int i = 0; i<5; i++){
			System.out.println(Thread.currentThread().getName());
		}
	}
}
class X implements Runnable{
	public void run(){
		try{Thread.sleep(1000);}catch(InterruptedException e){e.printStackTrace();}
		System.out.println(Thread.currentThread().getName());
	}
}
class A {
	public static void main(String []args){
		X x = new X();
		ThreadGroup ctg = Thread.currentThread().getThreadGroup();
		ThreadGroup tg = new ThreadGroup(ctg.getParent(),"Quad");
		
		Thread t1 = new Thread(tg , x , "Bharat");
		Thread t2 = new Thread(tg , x , "US");
		Thread t3 = new Thread(tg , x , "UK");
		Thread t4 = new Thread(tg , x , "Arab");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		System.out.println("Active count of Main Thread Group: "+ctg.activeCount());
		System.out.println("Active count of Quad Thread Group: "+tg.activeCount());
		System.out.println("Active count of System Thread Group: "+ctg.getParent().activeCount());
		
		System.out.println("~~~~~~~~~~~~~~");
        ctg.getParent().list();
        System.out.println("~~~~~~~~~~~~~~");
        ctg.list();
        System.out.println("~~~~~~~~~~~~~~");
        tg.list();
	}
}
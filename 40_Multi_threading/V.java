class MyThread extends Thread {
	public void run(){
		Thread t1 = Thread.currentThread();
		for (int i=0; i<100; i++){
			System.out.println(i+"-"+t1.getName()+"-"+t1.getPriority());
		}
		t1.setPriority(3);
		X x= new X();
		x.setName("B");
		x.start();
	}
}

class X extends Thread{
	public void run(){
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+"-"+t.getPriority());
	}
}

class A{
	public static void main (String []args){
		MyThread x = new MyThread();
		x.setName("Golu JI");
		// x.setPriority(10);
		x.start();
		// System.out.println(x.isAlive());
		Thread t = Thread.currentThread();
		t.setPriority(8);
		for (int i=0; i<100; i++){
			System.out.println(i+"-"+t.getName()+"-"+t.getPriority());
		}
	}
}
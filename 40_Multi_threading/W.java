class MyThread extends Thread {
	public void run(){
		Thread t1 = Thread.currentThread();
		for (int i=0; i<50; i++){
			System.out.println(i+"-"+t1.getName()+"-"+t1.getPriority()+" "+"yieling");
			Thread.yield();
		}

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
		for (int i=0; i<50; i++){
			System.out.println(i+"-"+t.getName()+"-"+t.getPriority());
		}
	}
}
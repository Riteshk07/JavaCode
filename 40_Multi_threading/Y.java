class MyThread extends Thread {
	public void run(){
		Thread t1 = Thread.currentThread();
	
		X x= new X();
		x.setName("B");
		x.start();
		for (int i=0; i<500; i++){
			System.out.println(i+"-"+t1.getName());
			if (i==25){
				try{
					x.join();
					System.out.println("Thread Joining");
				}catch(InterruptedException e){
					System.out.println(e);
				}
			}
		}
	}
}

class X extends Thread{
	public void run(){
		Thread t = Thread.currentThread();
		for (int i=0; i<500; i++){
			System.out.println(i+"-"+t.getName());
			
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
		Thread t 
	}
}
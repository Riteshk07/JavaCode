class MyThread extends Thread{
	public void run(){
		String threadName = Thread.currentThread().getName();
		for (int i=0; i<100; i++){
			System.out.println(i+"-"+threadName);
		}
	}
}

class A{
	public static void main (String []args){
		MyThread t = new MyThread();
		
		t.setName("Ritesh_Thread");
		t.start();
		String threadName = Thread.currentThread().getName();
		for (int i=0; i<100; i++){
			System.out.println(i+"-"+threadName);
		}
	}
}
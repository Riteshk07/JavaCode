class MyThread extends Thread {
	public void run(){
		Thread t = Thread.currentThread();
		for (int i=0; i<100; i++){
			System.out.println(i+"-"+t.getName()+"-"+t.getPriority());
		}
		
	}
}
class A{
	public static void main (String []args){
		MyThread x = new MyThread();
		x.setName("Golu JI");
		// x.setPriority(10);
		x.start();
		System.out.println(x.isAlive());
		Thread t = Thread.currentThread();
		t.setPriority(8);
		for (int i=0; i<100; i++){
			System.out.println(i+"-"+t.getName()+"-"+t.getPriority());
		}
	}
}
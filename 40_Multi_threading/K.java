class MyRunnable implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
}
class A{
	public static void main (String[]args){
		MyRunnable x = new MyRunnable();
		Thread t = new Thread(x);
		
		t.setName("Ritesh");
		
		t.start();
		
		System.out.println(Thread.currentThread().getName());
	}
}

// this is a second way to use thread
class MyThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
}
class A{
	public static void main (String[]args){
		MyThread x = new MyThread();
		
		x.setName("Ritesh");
		
		x.start();
		x.start();
		
		System.out.println(Thread.currentThread().getName());
	}
}

/*
java.lang.IllegalThreadStateException
        at java.base/java.lang.Thread.start(Thread.java:794)
        at A.main(J.java:13)
*/

// we can make thread in 2 ways
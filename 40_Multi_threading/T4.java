class MyRunnable implements Runnable {
	public void run(){
		int n = Thread.currentThread().getPriority();
	}
}
class A{
	public static void main (String []args){
		Thread x = new Thread(new MyRunnable(),"A");
		Thread y= Thread.currentThread();
		y.setPriority(11);
		System.out.println(y.getName()+"--"+y.getPriority());
		System.out.println(x.getName()+"--"+x.getPriority());
	}
}


/*
Exception in thread "main" java.lang.IllegalArgumentException
        at java.base/java.lang.Thread.setPriority(Thread.java:1141)
        at A.main(T4.java:10)
*/
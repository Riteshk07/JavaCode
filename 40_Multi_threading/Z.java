class A{
	public static void main (String []args) throws InterruptedException{
		Thread t = Thread.currentThread();
		System.out.println("This message Will never Print");
		t.join();
		System.out.println("This message Will never Print");
	}
}
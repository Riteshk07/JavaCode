class A{
	public static void main (String []args) throws InterruptedException{
		Thread t = Thread.currentThread();
		t.join(2000);
		System.out.println("kya se kya ho gya ");
	}
}
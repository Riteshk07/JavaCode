class A {
	public static void main (String[]args){
		Thread.currentThread().setDaemon(true);
	}
}

/*Exception in thread "main" java.lang.IllegalThreadStateException*/
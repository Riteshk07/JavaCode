class X extends Thread{
	public void run(){
		;
	}
}



class A {
	public static void main (String[]args){
		X x = new X();
		x.setName("A");
		x.start();
		x.setDaemon(true);
		try{Thread.sleep(1000);}catch(InterruptedException e ){e.printStackTrace();}
		
	}
}

/*Exception in thread "main" java.lang.IllegalThreadStateException*/
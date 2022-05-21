class X implements Runnable{
	public void run(){
		
	}
}

class A {
	public static void main (String [] args){
		X  x = new X();
		ThreadGroup tg = new ThreadGroup("QUAD");
		Thread t1 = new Thread(tg, x , "ISRIAL");
		Thread t2 = new Thread(tg, x , "Bharat");
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		tg.setMaxPriority(3);
		
		Thread t3 = new Thread(tg, x , "Rusia");
		Thread t4 = new Thread(tg, x , "US");
		//t3.setPriority(2);
		t3.setPriority(7);
		System.out.println(t3.getPriority());
		System.out.println(t4.getPriority());
		
		
	}
}
class X extends Thread{
	public void run(){
		Thread t = Thread.currentThread();
		for (int i=0; i<5; i++){
			try{sleep(1000);}catch(InterruptedException e){
				e.printStackTrace();
			}
			A.x-=10;
			System.out.println(A.x);
		}
		
	}
}

class A{
	static int x=50;
	public static void main (String []args) throws InterruptedException{
		X x = new X();
		x.setName("A");
		x.start();
		Thread t = Thread.currentThread();
		for (int i=0; i<5; i++){
			t.sleep(1000);
			A.x-=10;
			System.out.println(A.x);
		}
		
	}
}
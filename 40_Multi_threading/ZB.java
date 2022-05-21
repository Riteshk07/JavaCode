nclass X extends Thread{
	public void run(){
		Y y = new Y();
		y.setName("B");
		y.start();
		try{y.join();}catch (InterruptedException e ){System.out.println(e);}
		for (int i=0; i<10; i++){
			System.out.println(i+"-"+getName());
		}
	}
}

class Y extends Thread{
	public void run(){
		for (int i=0; i<10; i++){
			System.out.println(i+"-"+getName());
		}
	}
}

class A{

    public static void main(String[] args) {
		X x = new X();
		x.setName("A");
		x.start();
		
		// try{x.join();}catch (InterruptedException e ){System.out.println(e);}
		for (int i=0; i<10; i++){
			System.out.println(i+"-"+Thread.currentThread().getName());
			if (i==5){
				
				System.out.println(x.isAlive());
			}
		}
    }
}
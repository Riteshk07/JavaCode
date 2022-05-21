class MyThread extends Thread{
	public void run (){
		
		for (int i=0; i<20; i++){
			synchronized (this){
				System.out.println(i+"-"+Thread.currentThread().getName());
			}
		}
	}
}


class A{
	public static void main (String []args){
		MyThread  t1 = new MyThread(); 
		MyThread  t2 = new MyThread();
		t1.setName("A");
		t1.setName("B");
		
		t1.start();
		t2.start();
		
	}
}
class MyThread extends Thread{
	public void run()throws InterruptedException{
		String xName= Thread.currentThread().getName();
		for (int i=0; i<100; i++){
			System.out.println(i+"-"+xName);
			if (i==50){
					// Thread.sleep(2000);
					// Thread.sleep(200);
				Thread.sleep(20);
				
			}
		}
	}
}

class A{
	public static void main (String[]args){
		MyThread x = new MyThread();
		x.setName("Ritesh");
		x.start();
		String xName= Thread.currentThread().getName();
		for (int i=0; i<100; i++){
			System.out.println(i+"-"+xName);
		}
	}
}
/*
error: run() in MyThread cannot implement run() in Runnable
        public void run()throws InterruptedException{
                    ^
  overridden method does not throw InterruptedException
 */
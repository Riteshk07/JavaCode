class MyThread extends Thread{
	public void run(){
		String xName= Thread.currentThread().getName();
		for (int i=0; i<100; i++){
			System.out.println(i+"-"+xName);
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
			if (i==50){
				try{
					// Thread.sleep(2000);
					// Thread.sleep(200);
					Thread.sleep(20);
				}catch(InterruptedException e){
					System.out.println(e);
				}
			}
		}
	}
}
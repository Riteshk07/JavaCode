class MyThread extends Thread{
	public void run(){
		String xName= Thread.currentThread().getName();
		for (int i=0; i<100; i++){
			System.out.println(xName);
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
			System.out.println(xName);
			if (i==50){
				Thread.sleep(2000);
			}
		}
	}
}
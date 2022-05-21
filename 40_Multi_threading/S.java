class Golu implements Runnable {
	public void run(){
		String S = Thread.currentThread().getName();
		for (int i=0; i<100; i++){
			System.out.println(i+"-"+S);
			if (i==50){
				try{
					Thread.sleep(1000);
				}catch (InterruptedException e){
					System.out.println(e);
				}
			}
		}
	}
}

class A{
	public static void main (String[]args){
		Thread t = new Thread(new Golu(),"Golu's Thread");
		
		t.start();
		String S = Thread.currentThread().getName();
		for (int i=0; i<100; i++){
			System.out.println(i+"-"+S);
			
		}
		
	}
}
class Golu implements Runnable {
	public void run(){
		String S = Thread.currentThread().getName();
		for (int i=0; i<100; i++){
			System.out.println(i+"-"+S);
		}
	}
}

class A{
	public static void main (String[]args){
		Golu x = new Golu();
		Thread t = new Thread(x,"Golu's Thread");
		
		t.start();
		String S = Thread.currentThread().getName();
		for (int i=0; i<100; i++){
			System.out.println(i+"-"+S);
			if (i==50){
				try{
					t.sleep(1000);
				}catch (InterruptedException e){
					System.out.println(e);
				}
			}
		}
		
	}
}
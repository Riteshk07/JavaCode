class Golu extends Thread {
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
		x.setName("Golu's Thread");
		
		x.start();
		try{
			x.sleep(500);
		}catch (InterruptedException e){
			System.out.println(e);
		}
		String S = Thread.currentThread().getName();
		for (int i=0; i<100; i++){
			System.out.println(i+"-"+S);
		}
	}
}
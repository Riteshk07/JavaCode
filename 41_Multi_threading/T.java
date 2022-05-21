class VThread extends Thread{
	public void run(){
		synchronized (X.class){
			try{Thread.sleep(100);}catch (InterruptedException e){e.printStackTrace();}
			synchronized (Y.class){
				System.out.println("This is not reachable");
			}
		}
	}
}

class UThread extends Thread{
	public void run(){
		synchronized (Y.class){
			try{Thread.sleep(100);}catch (InterruptedException e){e.printStackTrace();}
			synchronized (X.class){
				System.out.println("This is also unreachable");
			}
		}
	}
}

class A {
	public static void main (String [] args){
		VThread a = new VThread ();
		UThread b = new UThread();
		a.setName("A");
		b.setName("B");
		a.start();
		b.start();
	}
}
class X{}
class Y{}
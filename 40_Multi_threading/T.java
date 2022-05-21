class MyRunnable implements Runnable {
	public void run(){
		int n = Thread.currentThread().getPriority();
	}
}
class A{
	public static void main (String []args){
		Thread x = new Thread(new MyRunnable(),"A");
		Thread y= Thread.currentThread();
		System.out.println(y.getName()+"--"+y.getPriority());
		System.out.println(x.getName()+"--"+x.getPriority());
	}
}


/*
in setPriority ()
Throws:
IllegalArgumentException - If the priority is not in the range MIN_PRIORITY to MAX_PRIORITY.
it is unchecked Exception.
*/
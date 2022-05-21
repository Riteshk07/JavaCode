class MyThread extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
}
class A{
	public static void main (String[]args){
		MyThread x1 = new MyThread();
		MyThread x2 = new MyThread();
		MyThread x3 = new MyThread();
		
		System.out.println(x1.getName());
		System.out.println(x2.getName());
		System.out.println(x3.getName());
		
		System.out.println(x1.getPriority());
		System.out.println(x2.getPriority());
		System.out.println(x3.getPriority());
		
		System.out.println(x1.getId());
		System.out.println(x2.getId());
		System.out.println(x3.getId());
		
	}
}
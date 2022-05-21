class A extends Thread {

    public static void main(String[] args) {
		Thread t = Thread.currentThread();
        for(int i=0;i<50;i++) {
			System.out.println(i+"-"+t.getName());
            if (i==25){
				try {
					System.out.println("Joining itself ...");
					t.join();
					t.resume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
        }
    }
}
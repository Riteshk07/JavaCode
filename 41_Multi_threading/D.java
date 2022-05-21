class X implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();

        for(int i=0; i<5; i++) {
            System.out.println(i+" - "+t.getName()+" is going to withdraw...");
            A.ac.withdraw(10) ;
            
            System.out.println(i+" - "+t.getName()+" is going to withdrawal completed... "+A.ac.getBalance());
        }
    }
}

class A {
    static Account ac = new Account();
    public static void main(String[] args) {
        X x = new X();

        Thread a = new Thread(x, "Golu");
        Thread b = new Thread(x, "Mohan");

        a.start();
        b.start();
    }
}

class Account {
    private int balance = 50;
	public int getBalance(){
		return(balance);
	}
	public void withdraw (int amt){
		
		if (balance>=amt){
			try { Thread.sleep(1000); } catch(InterruptedException e) { e.printStackTrace(); }
			balance -= amt;
		}
	}
}
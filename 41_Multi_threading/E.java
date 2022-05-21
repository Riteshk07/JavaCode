class X implements Runnable {
    public void run() {
        Thread t = Thread.currentThread();

        for(int i=0; i<5; i++) {
            System.out.println(i+" - "+t.getName()+" is going to withdraw...");
            A.ac.withdraw(10,i,t.getName()) ;
            
            
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
	synchronized public int getBalance(){
		return(balance);
	}
	synchronized public void withdraw (int amt, int i , String s){
		
		if (balance >=  amt){
			try { Thread.sleep(1000); } catch(InterruptedException e) { e.printStackTrace(); }
			balance -= amt;
			System.out.println(i+" - "+s+" is going to withdrawal completed... "+getBalance());
		}
	}
}
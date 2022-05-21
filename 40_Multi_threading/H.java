class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
    
    public void run(int t) {
        System.out.println(Thread.currentThread().getName()+" ~~~~~");
    }
}

class A {
    public static void main(String[] args) {
        MyThread t = new MyThread();

        t.setName("X_thread");

        t.start();

        System.out.println(Thread.currentThread().getName());
    }
}

// also check E.java
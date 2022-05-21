class A {
	public static void main (String[]args){
		Thread t = Thread.currentThread();
		System.out.println("Default Thread name: "+ t.getName());
		t.getThreadGroup().list();
		t.getThreadGroup().getParent().list();

	}
}

/*
Default Thread name: main
java.lang.ThreadGroup[name=main,maxpri=10]
    Thread[main,5,main]
java.lang.ThreadGroup[name=system,maxpri=10]
    Thread[Reference Handler,10,system]
    Thread[Finalizer,8,system]
    Thread[Signal Dispatcher,9,system]
    Thread[Attach Listener,5,system]
    java.lang.ThreadGroup[name=main,maxpri=10]
        Thread[main,5,main]
    java.lang.ThreadGroup[name=InnocuousThreadGroup,maxpri=10]
        Thread[Common-Cleaner,8,InnocuousThreadGroup]
*/

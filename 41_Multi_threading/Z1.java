class A {
	public static void main (String[]args){
		Thread t = Thread.currentThread();
		System.out.println("Default Thread name: "+ t.getName());
		System.out.println("Thread group Default Thread: "+ t.getThreadGroup().getName()+"~~");
		System.out.println("paraent therad group if main Thread group : "+ t.getThreadGroup().getParent().getName());
		System.out.println("paraent therad group if main Thread group : "+ t.getThreadGroup().getParent().getParent());
	}
}


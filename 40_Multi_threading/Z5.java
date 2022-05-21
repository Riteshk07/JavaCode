class X extends Thread{
	public void run(){
		try{A.y.join();}catch(InterruptedException e){System.out.println(e);}
	}
}

class Y extends Thread{
	public void run(){
		try{A.x.join();}catch(InterruptedException e){System.out.println(e);}
	}
}

class A {
	static X x ;
	static Y y ;
	public static void main(String []args){
		x= new X ();
		y= new Y();
		x.setName("A");
		y.setName("B");
		
		x.start();
		y.start();
	}
}
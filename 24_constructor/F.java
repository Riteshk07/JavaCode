class A {
	A(int x){
		System.out.println("hello");
	}
}
class B extends A {
    B(){
        super(2);
    }
	public static void main (String[]args){

		B x = new B();
	}
}

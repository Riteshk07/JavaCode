class A {
	A(int x){
		System.out.println("hello " + x);
	}
}
class B extends A {
    B(){
        super(1);
    }
}

class C extends B{
    C(){
        super();
    }
    public static void main(String[] args) {
        C x = new  C();
        System.out.println(x.toString());
    }
}
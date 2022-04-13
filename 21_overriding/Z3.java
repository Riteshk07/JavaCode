class B{
    void pro(){

        System.out.println("A");
    }
}
class A extends B{
    void pro(){

        System.out.println("B");
    }
}
class X {
    public static void main(String[] args) {
        A x = new B();
    }
}
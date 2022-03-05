class A {
    static {        System.out.println("H"); }

    static {        System.out.println("Y"); }

    {        System.out.println("W"); }

    A() {
        System.out.println("J");
    }
    A(int a) {
        System.out.println("J");
    }
    A(float y) {
        System.out.println("J");
    }

    public static void main(String[] args) {
        System.out.println("T");
        A x = new A();
        A x1 =new A(12);
        A x2 = new A(3.2f);
    }
}
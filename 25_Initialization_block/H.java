class A {
    static {        System.out.println("H"); }

    static {        System.out.println("Y"); }

    static {        System.out.println("W"); }

    A() {
        System.out.println("J");
    }

    public static void main(String[] args) {
        System.out.println("T");
        A x = new A();
        System.out.println("Q");
    }
}
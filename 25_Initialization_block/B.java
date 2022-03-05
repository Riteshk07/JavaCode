class A {
    static {
        System.out.println("Hi");
    }

    A() {
        System.out.println("bye");
    }

    public static void main(String[] args) {
        System.out.println("B");
        A x = new A();
        System.out.println("A");
    }
}
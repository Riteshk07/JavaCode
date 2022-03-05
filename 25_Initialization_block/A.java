class A {
    {
        System.out.println("Hello");
    }

    A() {
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        System.out.println("A");
        A x = new A();
        System.out.println("B");
    }
}
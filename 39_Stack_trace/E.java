class A {
    {
        System.out.println(1);
        int y = 12/0;
        System.out.println(2);
    }

    A(float f) {
        System.out.println(3);
    }

    A(int y) {
        this(2.3f);
        System.out.println(4);
    }

    public static void main(String[] args) {
        System.out.println(5);
        A x = new A(12);
        System.out.println(6);
    }
}
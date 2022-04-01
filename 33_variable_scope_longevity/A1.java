class A {
    void pro() {
        System.out.println(x); //error: cannot find symbol

        int x = 78;  //method local variable

        System.out.println(x);
    }

    public static void main(String[] args) {
        A a = new A();
        a.pro();
    }
}
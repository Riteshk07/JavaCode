class A {
    static int x = 78;
    public static void main(String[] args) {
        A a = new A();
        
        a.pro();        
    }

    void pro() {
        System.out.println(A.x);
    }
}
class A {
    void pro() {
        int x = 7;

        if(12<13) {
            int x = 11;   // G.java:6: error: variable x is already defined in method pro()
            System.out.println(x);
        }
    }
}
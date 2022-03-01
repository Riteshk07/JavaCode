class A {
    private A() {

    }
}

class X extends A {
    public static void main(String[] args) {
        
    }
}


/**
 G.java:7: error: A() has private access in A
class X extends A {
^
1 error 
 */
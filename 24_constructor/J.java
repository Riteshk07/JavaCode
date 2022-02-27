class A {
    void A(int x) {
        System.out.println("hello");
    }
}

class X {
    public static void main(String[] args) {
        new A(12);
    }
}

/*
D.java:9: error: constructor A in class A cannot be applied to given types;
        new A(12);
        ^
  required: no arguments
  found: int
  reason: actual and formal argument lists differ in length
1 error
*/
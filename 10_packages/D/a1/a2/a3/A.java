package a1.a2.a3;

import b1.b2.B;

class A {
    public static void main(String[] args) {
        B x = new B();

        System.out.println(x.t);
    }
}


// error: t is not public in B; 
// cannot be accessed from outside package
package a1.a2;

import a1.a2.a3.A;

class X {
    public static void main(String[] args) {
        A x = new A();
        x.info();        
    }    
}

// error: info() is not public in A; cannot be accessed from outside package
abstract class X {
    abstract void pro();
}

class A {
    public static void main(String[] args) {
        new X();
    }
}

// error: X is abstract; cannot be instantiate
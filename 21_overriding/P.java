class A {
    int pro() {
        return 12L;
    }
}

class B extends A {
    int pro() {
        return 12;
    }
}

// error: incompatible types: possible lossy conversion from long to int return 12L;
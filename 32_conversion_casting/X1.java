interface A { }

class B implements A { }

class C extends B { }

class X {
    public static void main(String[] args) {
        A x = new C();

        B y = (B)x; //widenning conversioon
        C z = (C)x; //narrowing conversioon
    }
}

// error: incompatible types: A cannot be converted to B
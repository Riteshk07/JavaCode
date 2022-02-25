class A {
    public void pro() {

    }
}

class B extends A {
    //same or wider access control can be applied on the overriding method...
    void pro() {

    }
}

// attempting to assign weaker access privileges; was public
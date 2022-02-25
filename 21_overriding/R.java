class A {
    void pro() {

    }
}

class B extends A {
    //same or wider access control can be applied on the overriding method...
    
    //Case 3:
    // public void pro() {

    // }

    //Case 2: 
    protected void pro() {

    }

    //Case 1:
    // void pro() {

    // }
}
class A {
    protected void pro() {

    }
}

class B extends A {
    //Case 3:
    public void pro() {
        
    }
    
    //Case 2:
    // protected void pro() {

    // }    


    //Case 1: NOT OK attempting to assign weaker access privileges; was protected
    // void pro() {

    // }
}
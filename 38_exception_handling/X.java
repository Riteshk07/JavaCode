import java.io.IOException;
import java.io.EOFException;

class A {
    void pro() throws IOException {

    }
}

class B extends A {                         
    void pro() throws EOFException{  //Narrower Exception in declaration is allowed

    }
}
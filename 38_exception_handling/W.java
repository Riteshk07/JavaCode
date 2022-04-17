import java.io.FileNotFoundException;
import java.io.EOFException;

class A {
    void pro() throws FileNotFoundException, EOFException {

    }
}

class B extends A {                         //Fewer Exception in declaration is allowed
    void pro() throws FileNotFoundException {  

    }
}
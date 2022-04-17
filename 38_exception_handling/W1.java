import java.io.FileNotFoundException;
import java.io.EOFException;

class A {
    void pro() throws FileNotFoundException, EOFException {

    }
}

class B extends A {                         
    void pro() {  //Fewer Exception in declaration is allowed

    }
}
import java.io.IOException;
import java.io.EOFException;

class A {
    void pro() throws EOFException {

    }
}

class B extends A {   //overridden method does not throw IOException                          
    void pro() throws IOException {  //Wider Exception in declaration is not allowed

    }
}
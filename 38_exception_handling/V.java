import java.io.FileNotFoundException;
import java.io.EOFException;

class A{
	void pro() throws FileNotFoundException{
		
	}
}
class B extends A {
	//Newer Exception in declaration is not allowed
	void pro()throws FileNotFoundException,EOFException{
	//overridden method does not throw EOFException
	}
}
/*
V.java:11: error: pro() in B cannot override pro() in A
        void pro()throws FileNotFoundException,EOFException{
             ^
  overridden method does not throw EOFException
1 error
*/
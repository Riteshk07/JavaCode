import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.File;

class A{
	public static void main (String [] args){
		File x = new File ("Java.txt");
		
		FileReader fr = new FileReader(x);
		
		System.out.println(fr.read());
		System.out.println(fr.read());
		System.out.println(fr.read());
		System.out.println(fr.read());
		
		fr.close();
		
	}
}

/*
 error: unreported exception FileNotFoundException; must be caught or declared to be thrown
                FileReader fr = new FileReader(x);
                                ^
A.java:12: error: unreported exception IOException; must be caught or declared to be thrown
                System.out.println(fr.read());
                                          ^
*/
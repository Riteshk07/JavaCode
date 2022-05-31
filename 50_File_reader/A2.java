import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.File;

class A{
	public static void main (String [] args) throws IOException{
		File x = new File ("Java.txt");
		
		FileReader fr = new FileReader(x);
		
		System.out.print((char)fr.read());
		System.out.print((char)fr.read());
		System.out.print((char)fr.read());
		System.out.print((char)fr.read());
		System.out.print((char)fr.read());
		fr.close();
		
	}
}
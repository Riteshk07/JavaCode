import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.File;

class A{
	public static void main (String [] args) throws IOException{
		BufferedReader B = new BufferedReader(new FileReader("Java.txt"));
		
		System.out.println((char)B.read());
		System.out.println((char)B.read());
		System.out.println((char)B.read());
		System.out.println((char)B.read());
		
		B.close();
		
	}
}
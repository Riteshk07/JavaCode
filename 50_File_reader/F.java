import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.File;

class A{
	public static void main (String [] args) throws IOException{
		BufferedReader B = new BufferedReader(new FileReader("Java.txt"));
		String n = null;
		while((n=B.readLine()) != null){
			System.out.println(n);
		}
		
		B.close();
		
	}
}
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.File;

class A{
	public static void main (String [] args) throws IOException{
		File x = new File ("Java.txt");
		
		FileReader fr = new FileReader(x);
		int n =0;
		while ((n=fr.read()) != -1){
			System.out.print((char)n);
		}
		fr.close();
		
	}
}
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.File;

class A{
	public static void main (String [] args) throws IOException{
		File x = new File ("Java.txt");
		
		FileReader fr = new FileReader(x);
		char []arr = new char[20];
		System.out.println(fr.read(arr));
		
		for (char t : arr){
			System.out.print(t);
		}
		
		fr.close();
		
	}
}
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

class A {
	public static void main (String [] args) {
		try{
			FileWriter fw = new FileWriter("moahn.txt",true);
			fw.append('E');
			fw.append('%');
			fw.append('u');
			fw.append('A');
			
			fw.flush();
			fw.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
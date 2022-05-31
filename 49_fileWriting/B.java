import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

class A {
	public static void main (String [] args) {
		try{
			FileWriter fw = new FileWriter("Ganesh.txt");
			fw.write('a');
			fw.write('b');
			fw.write('%');
			fw.write('$');
			fw.write(555);
			
			fw.flush();
			fw.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
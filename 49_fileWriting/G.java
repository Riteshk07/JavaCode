import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.File;

class A {
	public static void main (String [] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("Virat.txt")));
		
		bw.write("Neelesh is a good singer");
		bw.newLine();
		bw.write(new char[]{'R','a','a','j'});
		
		bw.flush();
		bw.close();
	}
}
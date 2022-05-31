import java.io.FileWriter;
import java.io.IOException;

class A {
	public static void main (String [] args) throws IOException{
		FileWriter fw = new FileWriter("DrSudheer.txt");
		
		String s1 = "Mohan is a good boy ";
		String s2 = "He is my Best Friend";
		
		fw.write(s1);
		fw.write('\n');
		fw.write(s2);
		
		fw.flush();
		fw.close();
	}
}
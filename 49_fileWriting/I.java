import java.io.PrintWriter;
import java.io.FileNotFoundException;

class A {
	public static void main(String [] args)throws FileNotFoundException{
		PrintWriter pw = new PrintWriter("Ritesh.txt");
		
		String name = "Shraddha kapoor";
		int age = 23;
		float Height = 5.5f;
		
		pw.printf("My name is %s And my age is %d and Height %.1f , I want to marry with Ritesh ",name, age, Height);
	
		// pw.print("My name is "+name+" And my age is "+age+" and Height "+Height+" , I want to marry with Ritesh ");
		
		pw.close();
	} 
}
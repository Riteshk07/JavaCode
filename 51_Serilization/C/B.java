import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;

class A{
	public static void main (String [] args ){
		try{
			File f = new File ("Java.txt");
			FileInputStream fis = new FileInputStream(f); 
			ObjectInputStream ois = new ObjectInputStream(fis); 
			
			Shape shape = (Shape)ois.readObject();
			ois.close();
		}catch(IOException e ){
			e.printStackTrace();
		}catch(ClassNotFoundException e ){
			e.printStackTrace();
		}
		System.out.prinln(shape.H);
		System.out.prinln(shape.W);
		System.out.prinln(shape.L);
		
	}
}
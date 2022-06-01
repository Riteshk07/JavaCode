import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;


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
		System.out.println(shape.H);
		System.out.println(shape.W);
		System.out.println(shape.L);
		
	}
}
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

class A{
	public static void main (String [] args){
		Shape  shape = new Shape(12,2,3);
		File x = new File("Java.txt");
		try{
			FileOutputStream fos = new FileOutputStream(x);
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(shape);
			oos.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
/*
java.io.NotSerializableException: Shape
*/
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;

class A{
	public static void main (String [] args ){
		try{
			File f = new File ("Bunty.txt");
			FileInputStream fis = new FileInputStream(f); 
			ObjectInputStream ois = new ObjectInputStream(fis); 
			
			Student s = (Student)ois.readObject();
			System.out.println(s.name);
			System.out.println(s.age);
			System.out.println(s.degree);
			System.out.println(s.sem);
			ois.close();
		}catch(IOException e ){
			e.printStackTrace();
		}catch(ClassNotFoundException e ){
			e.printStackTrace();
		}
		
		
	}
}
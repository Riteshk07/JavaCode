import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

class A{
	public static void main (String [] args)throws IOException{
		Student s1 = new Student ();
		s1.name = "Ritesh";
		s1.age = 21;
		s1.college = "JEC";
		
		Student s2 = new Student ();
		s2.name = "Rama";
		s2.age = 23;
		s2.college = "Global";
		
		FileOutputStream fos = new FileOutputStream("abc.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.writeObject(s2);
		oos.close();
	}
}
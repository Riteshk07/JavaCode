import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

class A {
	public static void main (String [] args ) throws IOException ,ClassNotFoundException{
		FileInputStream fis = new FileInputStream("abc.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student s1 = (Student)ois.readObject();
		Student s2 = (Student)ois.readObject();
		
		System.out.println(s1.name +" "+s1.age+" "+s1.college);
		System.out.println(s2.name +" "+s2.age+" "+s2.college);
		ois.close();
	}
}
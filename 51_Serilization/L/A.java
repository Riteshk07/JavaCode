import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

class A {
	public static void main (String [] args) throws IOException{
		Student s1 = new Student();
		s1.name = "om";
		s1.age = 21;
		s1.college = "Global";
		
		Student s2 = new Student ();
		s2.name = "Hariom";
		s2.age = 19;
		s2.college = "JEC";
		
		Employee emp = new Employee();
		emp.name = "ChaganLal";
		emp.company = "TCS";
		emp.salary = 32000;
		
		FileOutputStream fos = new FileOutputStream("abc.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.writeObject(s2);
		oos.writeObject(emp);
		oos.close();
		
	}
}
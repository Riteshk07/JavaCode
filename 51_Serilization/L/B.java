import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

class B{
	public static void main (String [] args) throws ClassNotFoundException, IOException{
		FileInputStream fis = new FileInputStream("abc.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student x1 = (Student)ois.readObject();
		Student x2 = (Student)ois.readObject();
		Employee e = (Employee)ois.readObject();
		
		System.out.println(x1.name+" "+x1.age+" "+x1.college);
		System.out.println(x2.name+" "+x2.age+" "+x2.college);
		System.out.println(e.name+" "+e.company+" "+e.salary);
		
		ois.close();
	}
}
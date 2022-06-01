import java.io.*;

class A{
	public static void main (String [] args) throws IOException{
		Employee e = new Employee();
		e.name = "Tamraj";
		e.age = 120;
		e.designation = "Manager";
		e.salary = 135000.45f;
		
		new ObjectOutputStream(new FileOutputStream("shaktiman.txt")).writeObject(e);
	}
}
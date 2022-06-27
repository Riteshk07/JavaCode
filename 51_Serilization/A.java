import java.io.*;

class A{
	public static void main (String [] args) throws IOException {
		Employee  e = new Employee();
		e.name = "Ratnesh";
		e.age = 28;
		e.address = new Address("Pune", "Maharashtra");
		
		FileOutputStream fos = new FileOutputStream("Shiva.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(e);
		
		oos.close();
		
	}
}
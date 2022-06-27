import java.io.*;

class A{
	public static void main (String [] args) throws IOException {
		Employee  e = new Employee();
		e.name = "Ratnesh";
		e.age = 28;
		
		NewAddress address = new NewAddress();
		address.city = "Bhopal";
		address.state = "MP" ;
		e.address = address;
		
		FileOutputStream fos = new FileOutputStream("abc.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(e);
		
		oos.close();
		
	}
}
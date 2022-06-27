import java.io.*;
class B{
	public static void main (String [] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee e = (Employee)ois.readObject();
		System.out.println(e.name);
		System.out.println(e.age);
		System.out.println(e.address);
		System.out.println(e.address.city);
		System.out.println(e.address.state);
	}
}
import java.io.*;

class B {
	public static void main (String [] args) throws ClassNotFoundException, IOException{
		Employee e = (Employee) (new ObjectInputStream(new FileInputStream("Kbc.txt")).readObject());
		
		System.out.println(e.name);
		System.out.println(e.age);
		System.out.println(e.address.city);
		System.out.println(e.address.state);
	}
}
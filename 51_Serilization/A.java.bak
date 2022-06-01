import java.io.*;

class A{
	public static void main (String [] args) throws IOException{
		Employee e = new Employee();
		e.name = "Tamraj";
		e.age = 120;
		Address address = new NewAddress();
		address.city= "JBP";
		address.state= "MP";
		
		e.address= address;
		
		new ObjectOutputStream(new FileOutputStream("Kbc.txt")).writeObject(e);
		
		
	}
}
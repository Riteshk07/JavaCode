import java.io.*;

class Employee implements java.io.Serializable{
	String name;
	int age;
	transient Address address;
	
	// Special Callback contract method...
	private void readObject(ObjectInputStream ois){
		try{
			ois.defaultReadObject();
			address.city = (String)ois.readObject();
			address.state = (String)ois.readObject();
		}catch(IOException | ClassNotFoundException e){
			e.printStackTrace();
		}
	}
	private void writeObject(ObjectOutputStream oos){
		try{
			oos.defaultWriteObject();
			oos.writeObject(address.city);
			oos.writeObject(address.state);
		}catch(IOException e){
			e.printStackTrace();
		}
	} 
}
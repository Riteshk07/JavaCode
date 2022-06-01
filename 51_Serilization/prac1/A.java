import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

class A{
	public static void main (String [] args){
		Person p1 = new Person("Ritesh", "09:30", "11:30","9856541339");
		Person p2 = new Person("Rajkumar", "10:30", "12:30","995645646");
		Person p3 = new Person("Sharad", "11:00", "12:00","9098541339");
		Person p4 = new Person("Pankaj", "12:30", "02:30","8962524515");
		Person p5 = new Person("Aakash", "01:45", "03:00","7856541366");
		Person p6 = new Person("Abhishek", "02:00", "3:30","8856541569");
		File x = new File("Data.txt");
		try{
			FileOutputStream fos = new FileOutputStream(x);
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
			oos.writeObject(p4);
			oos.writeObject(p5);
			oos.writeObject(p6);
			oos.close();
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}

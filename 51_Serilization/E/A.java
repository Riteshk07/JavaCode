import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

class A{
	public static void main (String [] args){
		Student S = new Student();
		S.name= "Bunty";
		S.age = 12;
		S.degree = "BTech";
		S.sem= "4th";
		File x = new File("Bunty.txt");
		try{
			FileOutputStream fos = new FileOutputStream(x);
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(S);
			oos.close();
			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}

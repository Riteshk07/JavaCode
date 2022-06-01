import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;

class Jcsv {
    static int sr = 0;
    public static void main (String [] args ){
		try{
			File f = new File ("Data.txt");
			FileInputStream fis = new FileInputStream(f); 
			ObjectInputStream ois = new ObjectInputStream(fis); 
			
			ArrayList<Person> x = new ArrayList<Person>();
            x.add((Person)ois.readObject());
            x.add((Person)ois.readObject());
            x.add((Person)ois.readObject());
            x.add((Person)ois.readObject());
            x.add((Person)ois.readObject());
            x.add((Person)ois.readObject());
			ois.close();

            PrintWriter pWrite = new PrintWriter("ShowData.csv");
            pWrite.println("Sr.No,Name,Entry Time,Exit Time,Mobile No.");
            for (Person t: x){
                sr++;
                pWrite.printf("%d,%s,%s,%s,%s",sr, t.name, t.entryT, t.exitT, t.MobN);
                pWrite.println();
            }
            pWrite.close();
		}catch(IOException e ){
			e.printStackTrace();
		}catch(ClassNotFoundException e ){
			e.printStackTrace();
		}
    }
}

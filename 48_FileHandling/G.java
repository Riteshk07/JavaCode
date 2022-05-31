import java.io.File;
import java.io.IOException;

class A {
	public static void main(String[] args){
		File file = new File("ChotaBheem.txt");
		
		try{
			file.createNewFile();
		}catch(IOException e ){
			e.printStackTrace();
		}
	}
}
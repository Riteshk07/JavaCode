import java.io.File;
import java.io.IOException;

class A {
	public static void main(String[] args){
		File file = new File("MotaBheem.txt");
		
		try{
			System.out.println(file.createNewFile());
		}catch(IOException e ){
			e.printStackTrace();
		}
	}
}
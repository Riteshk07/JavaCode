import java.io.File;

class A{
	public static void main (String [] args){
		// folder path, absolute path
		File file1 = new File("D:\\Java Code\\Example\\48_FileHandling\\AAA");
		
		// folder path, relative path
		File file2 = new File("Java Code\\Example\\48_FileHandling\\AAA");
		
		// folder path, absolute path
		File file3 = new File("D:\\Java Code\\Example\\48_FileHandling\\golu.txt");
		
		// folder path, relative path
		File file4 = new File("Java Code\\Example\\48_FileHandling\\golu.txt");
	}
}
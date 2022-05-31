import java.io.File;

class A {
	static int c=0;
    public static void main (String [] args){
        File file = new File("D:\\Java Code\\Example\\48_FileHandling","aaa");
        pro(file);
		System.out.println(c);
    }
    static void pro(File f){
		
		File file = f.getAbsoluteFile();
        if (file.isDirectory()){
			for (File tmp : f.listFiles()){
				c++;
				pro(tmp);	
			}
		}else{
			c++;
		}
		System.out.println(f.delete());
    }
}
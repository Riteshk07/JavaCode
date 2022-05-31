import java.io.File;

class A {
	static int c=0;
    public static void main (String [] args){
        File file = new File("D:\\Java Code\\Example\\48_FileHandling","aaa");
        pro(file);
		System.out.println(c);
    }
    static void pro(File f){
        if (f.isDirectory()){
			String [] lst = f.list();
			for (String tmp : lst){
				pro(new File(f,tmp));
				f.delete();	
				c++;
			}
		}else{
			c++;
		}
		f.delete();
    }
} 
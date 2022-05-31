import java.io.File;

class A {
	static int c=0;
    public static void main (String [] args){
        File file = new File("D:\\Java Code\\Example\\48_FileHandling","aaa");
        pro(file);
		System.out.println(c);
    }
    static void pro(File f){
        String [] lst = f.list();
        if (lst.length != 0){
			for (String tmp : lst){
				File file = new File(f,tmp);
				if (file.isDirectory()){
					pro(file);
				}else{
					file.delete();
				}
				c++;
			}
		}
		f.delete();
		c++;
    }
}
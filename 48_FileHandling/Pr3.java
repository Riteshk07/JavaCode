import java.io.File;

class A {
    public static void main (String [] args){
        File file = new File("D:\\Java Code\\Example\\48_FileHandling","aaa");
        pro(file);
    }
    static void pro(File f){
        String [] lst = f.list();
        for (String tmp : lst){
            File file = new File(f.getAbsolutePath(),tmp);
            if (file.isDirectory()){
                pro(file);
				file.delete();
            }else{
                file.delete();
            }
			System.out.println("Recursion 1");
        }
		f.delete();
		System.out.println("Recursion 2");
    }
}
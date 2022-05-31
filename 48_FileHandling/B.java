import java.io.File;
class A {
    public static void main (String [] args){
        File file = new File("D:\\Java Code\\Example\\48_FileHandling","aaa");
        String [] lst = file.list();
		System.out.println(lst.length);
    }
}
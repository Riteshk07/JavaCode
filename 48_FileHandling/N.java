import java.io.File;

class A {
    public static void main(String[] args) {
        File file = new File("D:\\Java Code\\Example\\48_FileHandling\\dholubholu.txt");
		
		// File file = new File("dholubholu.txt");	// null

        String parentPath = file.getParent();

        System.out.println("### " + parentPath + " ####");
    }
}
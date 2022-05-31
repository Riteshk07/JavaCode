import java.io.File;

class A {
    public static void main(String[] args) {
        // File file = new File("Tikku");
        //or
        File file = new File("dholubholu.txt");

        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
    }
}
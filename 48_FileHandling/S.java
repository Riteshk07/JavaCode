import java.io.File;

class A {
    public static void main(String[] args) {
        // File parent = new File("D:\\Java Code\\Example\\48_FileHandling");
        // File file = new File(parent,"aaa");

        File parent = new File("D:\\Java Code\\Example");
        File file = new File(parent, "48_FileHandling\\aaa");

        System.out.println(file.exists());
    }
}
import java.io.File;

class A {
    public static void main(String[] args) {
        File file = new File("dholubholu.txt");

        File dest = new File("DholuBholuCompany");

        file.renameTo(dest);
    }
}
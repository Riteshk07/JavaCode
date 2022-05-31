import java.io.File;

class A {
    public static void main(String[] args) {
        File file = new File("DholuBholuCompany/sanatan.txt");

        File dest = new File("E:\\jaggu.txt");

        file.renameTo(dest);
    }
}
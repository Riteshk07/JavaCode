import java.io.File;
import java.io.IOException;

class A {
    public static void main(String[] args) throws IOException {
        File file = new File("KALIYA");

        System.out.println(file.exists());

        file.mkdir();

        System.out.println(file.exists());
    }
}
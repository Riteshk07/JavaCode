import java.io.FileWriter;
import java.io.IOException;

class A {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("jambo.txt");

        String str = "mohan is a good boy";

        fw.write(str);

        fw.flush();
        fw.close();
    }
}
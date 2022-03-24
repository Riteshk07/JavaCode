import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList<String>();

        x.add("mohan");
        x.add("rohan");
        x.add("sohan");
        x.add("tohan");

        String y = String.join("#", x);

        System.out.println(y);
    }
}
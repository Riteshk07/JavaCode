import java.io.Console;
class A {
    public static void main(String[] args) {
        Console x = System.console();

        System.out.print("First Name: ");
        String firstName = x.readLine();

        System.out.print("Last Name: ");
        String lastName = x.readLine();

        System.out.println(firstName + " " + lastName);
    }
}
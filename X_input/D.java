import java.io.Console;
import java.util.Scanner;

class A{
	public static void main (String[]args){
		Console c = System.console();
        Scanner s = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = c.readLine();
        System.out.print("Enter your Age: ");
        byte age=s.nextByte();
		System.out.println("My name is: "+name+"\nMy Age is: "+age);
	}
}
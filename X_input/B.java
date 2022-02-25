import java.util.Scanner;

class A {
	public static void main (String[]args){
		Scanner s = new Scanner (System.in);
		System.out.print("Enter Your Name: ");
		String name = s.next();
		System.out.println("My name is: "+ name);
	}
}
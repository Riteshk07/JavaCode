import java.io.Console;

class A {
	public static void main (String[]args){
		Console c = System.console();
		System.out.print("Enter your name: ");
		String name = c.readLine();
		System.out.print("Enter your age: ");
		String StrAge = c.readLine();
		byte age = Byte.parseByte(StrAge);
        System.out.println("My name is: "+name+"\nMy Age is: "+age);
	}
}
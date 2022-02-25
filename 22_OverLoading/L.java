import java.io.Console;
import java.util.Scanner;
class A {
	void add(int a,int b){
		int sum = a+b;
		System.out.println("Add of two Interger is: "+sum);
	}
	void add(float a,float b){
		float sum = a+b ;
		System.out.println("Add of two Float is: "+sum); 
	}
}
class X {
	public static void main(String[]args){
		A x = new A();
		System.out.print("Input two Float num: ");
		x.add(Float.parseFloat(System.console().readLine()),Float.parseFloat(System.console().readLine()));
		System.out.print("Input two Integer num: ");
		// x.add(Integer.parseInt(System.console().readLine()),Integer.parseInt(System.console().readLine()));
		x.add(new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt());
	}
}
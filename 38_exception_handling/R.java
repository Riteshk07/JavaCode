import java.util.Scanner;

class A{
	public static void main(String []args){
		try {
			Scanner s = new Scanner(System.in);
			System.out.print("Enter a Number: ");
			int n = s.nextInt();
			int y =12/n;
		}catch(ArithmeticException e){
			throw new ArithmeticException();
		}
	}
}
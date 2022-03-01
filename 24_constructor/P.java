import java.util.Scanner;
class A {
	static int i=1;
	final int x;
	A(){
        System.out.println("Enter "+ i++ +" value of Final variable of x: ");
        x=new Scanner(System.in).nextInt();
        System.out.println("the value of final variable of x is: "+this.x);
	}
	public static void main(String[]args){
		new A();
        new A();
        new A();
    }
}
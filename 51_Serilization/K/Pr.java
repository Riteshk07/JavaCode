import java.util.Scanner;
class X {
	static void pro(){
		Scanner sc  = new Scanner(System.in);
		long x = sc.nextLong(); // a + b
		long y = sc.nextLong(); // a ^ b
		if (x == 0 || ((x^y) & 1) == 1){
			System.out.println(-1);
		}else{
			long a = (x+y)/2;
			long b = x-a;
			System.out.println(a);
			System.out.println(b);
		}
	}
	public static void main (String [] args){
		X.pro();
	}
}


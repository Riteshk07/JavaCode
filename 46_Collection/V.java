
import java.util.Arrays;

class A{
	public static void main (String [] args ){
		char [] x = {'t','A','a','1','0'};
		for (char t : x){
			System.out.print(t+" ");
		}
		System.out.println();
		Arrays.sort(x);
		for (char t : x){
			System.out.print(t+" ");
		}
	}
}
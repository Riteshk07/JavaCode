
import java.util.Arrays;

class A{
	public static void main (String [] args ){
		int [] x = {45,89,56,12,13};
		for (int t : x){
			System.out.print(t+" ");
		}
		System.out.println();
		Arrays.sort(x);
		for (int t : x){
			System.out.print(t+" ");
		}
	}
}
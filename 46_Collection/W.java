
import java.util.Arrays;

class A{
	public static void main (String [] args ){
		String [] x = {"Mohan","tohan","sohan","Bohan","nohan"};
		for (String t : x){
			System.out.print(t+" ");
		}
		System.out.println();
		Arrays.sort(x);
		for (String t : x){
			System.out.print(t+" ");
		}
	}
}
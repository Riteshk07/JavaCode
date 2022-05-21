
import java.util.Arrays;

class A{
	public static void main (String [] args ){
		String [] x = {"Mohan","tohan","sohan","Bohan","nohan"};
		for (String t : x){
			System.out.print(t+" ");
		}
		System.out.println();
		System.out.println(Arrays.binarySearch(x,"mohan"));
		System.out.println(Arrays.binarySearch(x,"tohan"));
		System.out.println(Arrays.binarySearch(x,"sohan"));
		System.out.println(Arrays.binarySearch(x,"nohan"));
	}
}
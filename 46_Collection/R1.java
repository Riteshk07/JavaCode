import java.util.ArrayList;
import java.util.Collections;

class A{
	public static void main (String [] args){
		ArrayList<String> x = new ArrayList <String> ();
		
		x.add("mohan");
		x.add("sohan");
		x.add("rohan");
		x.add("tohan");
		x.add("gohan");
		
		Collections.sort(x);
		System.out.println(x);
		
		System.out.println(Collections.binarySearch(x,"mohan"));	// index->1
		System.out.println(Collections.binarySearch(x,"tohan"));	// index->4
		System.out.println(Collections.binarySearch(x,"gohan"));	// index->0
		System.out.println(Collections.binarySearch(x,"sohan"));	// index->3
	}
}

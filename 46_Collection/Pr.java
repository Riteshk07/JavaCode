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

		System.out.println(x);
		System.out.println(Collections.binarySearch(x,"mohan"));	// index->0
		System.out.println(Collections.binarySearch(x,"tohan"));	// index->3
		System.out.println(Collections.binarySearch(x,"gohan"));	// index->-1
		System.out.println(Collections.binarySearch(x,"sohan"));	// index->-4
		System.out.println(Collections.binarySearch(x,"hohan"));   // index->-1
        System.out.println(Collections.binarySearch(x,"eohan"));   // index->-1
	}
}
// Negative index - It is showing the list, not in an Ascending order
// formula for negative index -> (-(insertion point) - 1)
// Binary Search is a searching algorithm used in a sorted array by repeatedly dividing the search interval in half.
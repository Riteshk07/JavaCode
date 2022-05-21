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
		
        System.out.println(Collections.binarySearch(x, "nohan"));  
        System.out.println(Collections.binarySearch(x, "pohan"));
        System.out.println(Collections.binarySearch(x, "hohan"));
        System.out.println(Collections.binarySearch(x, "eohan"));
	}
}

// formula for negative index -> (-(insertion point) - 1)
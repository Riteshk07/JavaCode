import java.util.ArrayList;
import java.util.Collections;

class A{
	public static void main (String [] args){
		ArrayList<String> x = new ArrayList<String>();
		
		x.add("mohan");
		x.add("sohan");
		x.add("rohan");
		x.add("gohan");
		x.add("tohan");
		
		System.out.println(x);
		
		Collections.sort(x);
		
		System.out.println(x);
	}
}
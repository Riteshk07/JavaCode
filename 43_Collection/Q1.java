import java.util.ArrayList;
import java.util.Iterator;

class A {
	public static void main (String []args){
		ArrayList<String> x = new ArrayList<String>();
		
		x.add(new String ("#mohan"));
		x.add(new String ("#rohan"));
		x.add(new String ("#sohan"));
		x.add(new String ("#tohan"));
		x.add(new String ("#gohan"));
		
		System.out.println(x);
		int s = x.size();
		for (int i=0; i<s; i++){
			System.out.println(x.remove(i));
		}
		
		System.out.println(x);
	}	
}

// java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 2
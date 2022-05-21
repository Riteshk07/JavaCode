import java.util.HashSet;
import java.util.Iterator;

class A {
	public static void main (String[]args){
		HashSet<Integer > x = new HashSet<Integer>();
		System.out.println(x.isEmpty());
		System.out.println(x.size());
		x.add(67);
		x.add(45);
		x.add(12);
		x.add(89);
		
		Integer y = Integer.valueOf(45);
		System.out.println(x);
		//System.out.println(x.remove(y));
		System.out.println(x.remove(2));
		System.out.println(x.remove(12));
		System.out.println(x);
		
	}
}

// Duplicate records not allowed 
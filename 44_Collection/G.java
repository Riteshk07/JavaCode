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
		
		Iterator<Integer> itr = x.iterator();
		
		while (itr.hasNext()){
			//System.out.println(itr.next());
			System.out.println(itr.next().floatValue());
		}
	}
}

// Duplicate records not allowed 
import java.util.ArrayList;
class A {
	public static void main (String [] args){
		ArrayList<Integer> x = new ArrayList<Integer>();
		x.add(45);
		x.add(89);
		x.add(78);
		x.add(12);
		x.add(56);
		System.out.println(x);
		
		Integer [] w = new Integer[0];
		Integer [] y = x.toArray(w);
		for (Object t : y){
			System.out.println(t);
			//System.out.println(t.shortValue());
			// System.out.println(((Integer)t).shortValue());
		}
	}
}
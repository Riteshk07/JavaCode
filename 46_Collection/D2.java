import java.util.ArrayList;
class A {
	public static void main (String [] args){
		ArrayList x = new ArrayList();
		x.add(45);
		x.add(89);
		x.add(78);
		x.add(12);
		x.add(56);
		System.out.println(x);
		
		
		Integer [] y = x.toArray(new Integer[0]);
		// error: incompatible types: Object[] cannot be converted to Integer[]
		// Type Safty must required
		for (Object t : y){
			System.out.println(t);
			//System.out.println(t.shortValue());
			// System.out.println(((Integer)t).shortValue());
		}
	}
}
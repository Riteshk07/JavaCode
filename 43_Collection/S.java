import java.util.ArrayList;

class A {
	public static void main (String [] args){
		ArrayList x = new ArrayList();
		
		x.add(12);
		x.add(13);
		x.add(14);
		x.add(15);
		x.add(16);
		
		System.out.println(x);
		System.out.println(x.set(2, 22));
		System.out.println(x.set(4, 22));
		// System.out.println(x.set(20, 22));	// java.lang.IndexOutOfBoundsException: Index 20 out of bounds for length 5
		
		System.out.println(x);
	}
}
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
		x.add(2, 22);
		x.add(4, 22);
		// x.add(20, 22);	// "main" java.lang.IndexOutOfBoundsException: Index: 20, Size: 7
		
		System.out.println(x);
	}
}
import java.util.ArrayList;

class A {
	public static void main (String [] args){
		ArrayList x = new ArrayList();
		
		x.add(5);
		x.add(2);
		x.add(7);
		x.add(2);
		x.add(9);
		x.add(2);
		x.add(9);
		
		Integer w = Integer.valueOf(2);
		System.out.println(x);
		while(x.remove(w));
		System.out.println(x);
	}
}
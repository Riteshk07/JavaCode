import java.util.ArrayList;
class A {
	public static void main (String [] args){
		
		ArrayList<Integer> a3 = new ArrayList<Integer>();
		a3.add(45);
		a3.add(12);
		a3.add(true);	// error: incompatible types: boolean cannot be converted to Integer
	}
}


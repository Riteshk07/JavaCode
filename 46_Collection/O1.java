import java.util.ArrayList;
import java.util.Collections;

class A{
	public static void main (String [] args){
		ArrayList<String> x = new ArrayList<String>();
		
		x.add(89);
		x.add(88);
		x.add(56);
		x.add(45);
		x.add(31);
		
		
		System.out.println(x);
		
		Collections.sort(x);
		
		System.out.println(x);
	}
}
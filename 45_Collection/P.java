import java.util.HashMap;
import java.util.Set;

class A {
	public static void main (String [] args){
		HashMap<String , Integer>  x = new HashMap<String, Integer>();
		
		System.out.println(x.put("Ram", 56));
		System.out.println(x.put("Shyam", 89));
		System.out.println(x.put("mohan", 45));
		
		
		System.out.println(x.containsValue(89));
		
	}
}
/*
Keys can not be duplicate
*/

import java.util.HashMap;
import java.util.Set;

class A {
	public static void main (String [] args){
		HashMap<String , Integer>  x = new HashMap<String, Integer>();
		
		System.out.println(x.put("Ram", 56));
		System.out.println(x.put("Shyam", 89));
		System.out.println(x.put("Ram", 45));
		
		
		Set <String> y = x.keySet();
		System.out.println(y);
		
		for (String t : y){
			System.out.println(t+" - "+x.get(t));
		}
		
	}
}
/*
Keys can not be duplicate
*/

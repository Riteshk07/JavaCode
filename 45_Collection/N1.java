import java.util.HashMap;
import java.util.Set;

class A {
	public static void main (String [] args){
		HashMap<String , Integer>  x = new HashMap<String, Integer>();
		
		x.put("Ram", 56);
		x.put("Shyam", 89);
		x.put("Raghunandan", 89);
		x.put("Ritesh", 78);
		x.put("Bunty", 45);
		
		Set y = x.keySet();
		System.out.println(y);
		
		for (Object t : y){
			System.out.println(t);
			
		}
		
	}
}


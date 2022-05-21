import java.util.HashMap;

class A {
	public static void main (String [] args){
		HashMap<String , Integer>  x = new HashMap<String, Integer>();
		
		x.put("Ram", 56);
		x.put("Shyam", 89);
		x.put("Raghunandan", 89);
		x.put("Ritesh", 78);
		x.put("Bunty", 45);
		
		for (Object t : x){
			System.out.println(t);
			
		}
	}
}

/*
error: for-each not applicable to expression type
                for (Object t : x){
                                ^
  required: array or java.lang.Iterable
  found:    HashMap<String,Integer>
*/
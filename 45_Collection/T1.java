import java.util.LinkedHashMap;

class A{
	public static void main(String [] args){
		LinkedHashMap<String, Integer> x = new LinkedHashMap <String, Integer> ();
		x.put("Ritesh",99);
		x.put("Rajmohan",88);
		x.put(null,78);
		x.put("Nirjala",null);
		System.out.println(x);
	}
}
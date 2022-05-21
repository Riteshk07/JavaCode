import java.util.HashMap;
class A {
	public static void main (String [] args){
		HashMap x = new HashMap();
		
		x.put("Ram", 56);
		x.put("Shyam", 89);
		x.put("Raghunandan", 89);
		x.put("Ritesh", 78);
		x.put("Bunty", 45);
		
		System.out.println(x);
		System.out.println(x.isEmpty());
		System.out.println(x.size());
	}
}
import java.util.TreeMap;

class A {
	public static void main (String [] args){
		TreeMap<String, Integer> x1 = new TreeMap<String, Integer>();
		
		x1.put("golu",12);
		x1.put("bholu",18);
		x1.put("folu",14);

		String y = new String ("bholu");
		System.out.println(x1.containsKey(y));
	}
}
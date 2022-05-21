import java.util.TreeMap;

class A {
	public static void main (String [] args){
		TreeMap<String, Integer> x1 = new TreeMap<String, Integer>();
		TreeMap<Integer, String> x2 = new TreeMap<Integer, String>();
		
		x1.put("golu",12);
		x1.put("bholu",18);
		x1.put("folu",14);
		
		x2.put(23 ,"holu");
		x2.put(21 ,"Bholu");
		x2.put(19 ,"Molu");
		System.out.println(x1);
		System.out.println(x2);
	}
}
import java.util.Hashtable;

class A {
	public static void main (String [] args){
		Hashtable<String, Integer> x = new Hashtable <String, Integer> ();
		x.put("Ritesh",99);
		x.put("Rajmohan",88);
		// x.put(null,78);	// java.lang.NullPointerException
		// x.put("Nirjala",null);	// java.lang.NullPointerException
		System.out.println(x);
	}
}
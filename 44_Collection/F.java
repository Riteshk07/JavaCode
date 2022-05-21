import java.util.HashSet;

class A {
	public static void main (String[]args){
		HashSet<String> x = new HashSet<String>();
		System.out.println(x.isEmpty());
		System.out.println(x.size());
		x.add("mohan");
		x.add("sonu");
		x.add("banti");
		x.add("Gaytonde");
		x.add("ghanshyam");
		
		for (String y:x){
			System.out.println(y+"#");
			System.out.println(y.length());
		}
	}
}

// Duplicate records not allowed 
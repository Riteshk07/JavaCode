import java.util.HashSet;

class A {
	public static void main (String[]args){
		HashSet x = new HashSet();
		System.out.println(x.isEmpty());
		System.out.println(x.size());
		x.add("mohan");
		x.add("rohan");
		x.add("tohan");
		x.add("sohan");
		x.add("gohan");
		
		System.out.println(x);
		System.out.println(x.isEmpty());
		System.out.println(x.size());
	}
}

// Duplicate records not allowed 
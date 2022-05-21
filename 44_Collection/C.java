import java.util.HashSet;

class A {
	public static void main (String[]args){
		HashSet x = new HashSet();
		x.add("mohan");
		x.add("rohan");
		x.add("mohan");
		x.add("sohan");
		
		System.out.println(x);
	}
}

// Duplicate records not allowed 
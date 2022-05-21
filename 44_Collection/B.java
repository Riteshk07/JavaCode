import java.util.HashSet;

class A {
	public static void main (String[]args){
		HashSet x = new HashSet();
		x.add(12);
		x.add(14);
		x.add(14);
		x.add(45);
		x.add(19);
		System.out.println(x);
	}
}

// Duplicate records not allowed 
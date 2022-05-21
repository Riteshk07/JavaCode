import java.util.ArrayList;

class A {
	public static void main (String[] args){
		ArrayList<Integer> x = new ArrayList<Integer>();
		x.add(12);
		x.add("Ritesh");
		x.add(14.55);
		System.out.println(x);
	}
}

/*
B1.java:7: error: incompatible types: String cannot be converted to Integer
                x.add("Ritesh");
                      ^
B1.java:8: error: incompatible types: double cannot be converted to Integer
                x.add(14.55);
                      ^
*/
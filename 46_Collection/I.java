import java.util.TreeSet;
class A {
	public static void main (String [] args){
		TreeSet<String> x = new TreeSet<String>();
		x.add("rajesh");
		x.add("mahesh");
		x.add("suresh");
		x.add("halkesh");
		x.add("dinesh");
		
		System.out.println(x);
		System.out.println(x.floor("mahesh"));
		System.out.println(x.floor("hariram"));
	}
}
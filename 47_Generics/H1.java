import java.util.ArrayList;

class A {
	public static void main (String [] args){
		ArrayList <Integer> x = new ArrayList<Integer>();

		x.add(45);
		x.add(46);
		x.add(89);
		x.add(13);
		pro(x);
		System.out.println(x);
	}
	
	static void pro(ArrayList lst){
		lst.add("golu");
		lst.add(true);
		lst.add(12.6);
		
	}
	
}
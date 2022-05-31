import java.util.ArrayList;

class A {
	public static void main (String [] args){
		ArrayList  x = new ArrayList();

		x.add("golu");
		x.add(true);
		x.add(56);
		x.add(13.45);
		pro(x);
		System.out.println(x);
	}
	
	static void pro(ArrayList<Integer> lst){
		
		lst.add(45);
		lst.add(46);
		lst.add(89);
	}
	
}
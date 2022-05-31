import java.util.ArrayList;

class A {
	public static void main (String [] args){
		ArrayList<Integer> x = new ArrayList<Integer>();
		x.add(12);
		x.add(45);
		x.add(56);
		pro(x);
	}
	static void pro(ArrayList <? extends Number> lst){
		// lst.set(1,16);  //  error: incompatible types: int cannot be converted to CAP#1
		System.out.println(lst.get(0));
		System.out.println(lst.get(1));
		System.out.println(lst.get(2));
	}
}
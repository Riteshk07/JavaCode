import java.util.ArrayList;

class A {
	public static void main (String [] args){
		ArrayList <Integer> x1 = new ArrayList<Integer>();
		x1.add(45);
		x1.add(56);
		x1.add(14);
		pro(x1);
		
		
		ArrayList <Float> x2 = new ArrayList<Float>();
		x2.add(45.12f);
		x2.add(26.12f);
		x2.add(48.12f);
		pro(x2);
	}
	
	static void pro(ArrayList<? extends Number> lst){
		for (Number t : lst){
			System.out.println(t);
		}
	}
	
}
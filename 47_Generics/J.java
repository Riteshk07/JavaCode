import java.util.ArrayList;

class A {
	public static void main (String [] args){
		ArrayList <? extends Number> x1 = new ArrayList<Integer>();
		ArrayList <? extends Number> x2 = new ArrayList<Byte>();
		ArrayList <? extends Number> x3 = new ArrayList<Short>();
		ArrayList <? extends Number> x4 = new ArrayList<Long>();
		ArrayList <? extends Number> x5 = new ArrayList<Double>();

		
		
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		System.out.println(x4);
		System.out.println(x5);
	}
	
	static void pro(ArrayList lst){
		
		
	}
	
}
import java.util.ArrayList;
class A {
	public static void main (String [] args){
		
		ArrayList a3 = new ArrayList();
		a3.add(45);
		a3.add(12);
		a3.add(true);	
		System.out.println(a3);
		Integer x = a3.get(0);  // error: incompatible types: Object cannot be converted to Integer
		System.out.println(x);
	}
}


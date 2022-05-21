import java.util.ArrayList;

class A {
	public static void main (String []args){
		ArrayList x = new ArrayList();
		
		x.add(new String ("mohan"));
		x.add(new String ("rohan"));
		x.add(new String ("sohan"));
		x.add(new String ("tohan"));
		x.add(new String ("gohan"));

		for (int i =0; i<x.size(); i++){
			// System.out.println(x[i]);	// error: array required, but ArrayList found
			System.out.println(x.get(i));
		}
	}
}
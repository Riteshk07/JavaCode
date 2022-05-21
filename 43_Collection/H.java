import java.util.ArrayList;

class A {
	public static void main (String []args){
		ArrayList x = new ArrayList();
		
		System.out.println(x.isEmpty());
		
		x.add(new String ("mohan"));
		x.add(new String ("rohan"));
		x.add(new String ("sohan"));
		x.add(new String ("tohan"));
		x.add(new String ("gohan"));

		System.out.println(x.isEmpty());
	}
}
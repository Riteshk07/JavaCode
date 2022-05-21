import java.util.ArrayList;

class A {
	public static void main (String []args){
		ArrayList x = new ArrayList();
		
		x.add(new String ("mohan"));
		x.add(new String ("rohan"));
		x.add(new String ("sohan"));
		x.add(new String ("tohan"));
		x.add(new String ("gohan"));
		
		// String str = new String ("sohan");
		String str = new String ("ganesh");
		
		System.out.println(x);
		System.out.println(x.remove(str));
		System.out.println(x);
	}
}
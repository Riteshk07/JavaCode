import java.util.ArrayList;

class A {
	public static void main (String []args){
		ArrayList<String> x = new ArrayList<String>();
		
		x.add(new String ("mohan"));
		x.add(new String ("rohan"));
		x.add(new String ("sohan"));
		x.add(new String ("tohan"));
		x.add(new String ("gohan"));
		int s = x.size();
		System.out.println(x);
		for (int i =0; i<s; i++){
			System.out.println(x.remove(0));
		}
		System.out.println(x);
	}	
}
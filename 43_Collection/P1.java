import java.util.ArrayList;
import java.util.Iterator;

class A {
	public static void main (String []args){
		ArrayList x = new ArrayList();
		
		x.add(new String ("#mohan"));
		x.add(new String ("#rohan"));
		x.add(new String ("#sohan"));
		x.add(new String ("#tohan"));
		x.add(new String ("#gohan"));
		Iterator itr = x.iterator();
		
		while(itr.hasNext()){
			// System.out.println(itr.next().length());
			System.out.println(((String)itr.next()).length());
		}
	}	
}
import java.util.ArrayList;

class A {
	public static void main (String [] args){
		ArrayList <Z> a1 = new ArrayList<Z>();
		a1.add(new Z());
		a1.add(new Z());
		a1.add(new Z());
		pro(a1);
	}
	static void pro(ArrayList<? extends X> lst){
		for(X t : lst){
			System.out.println(t);
		}
	}
}

interface X {}

class Z implements X {}

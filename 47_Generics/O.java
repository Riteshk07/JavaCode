import java.util.ArrayList;

class A {
	public static void main (String [] args){
		ArrayList <? extends X> a1 = new ArrayList<Z>();
		ArrayList <? extends X> a2 = new ArrayList<Y>();
	}
}

interface X {}

class Z implements X {}
class Y implements X {}
import java.util.ArrayList;

class A {
	public static void main (String [] args){
		int t = Integer.parseInt(args[0]);
		ArrayList <? extends Number> a1 = null;
		if (t==1){
			a1 = pro();
		}else if (t==2){
			a1 = info();
		}
		System.out.println(a1);
	}
	static ArrayList pro(){
		ArrayList<Integer> lst = new ArrayList<Integer>();
		
		lst.add(12);
		lst.add(44);
		lst.add(16);
		return lst;
	}
	static ArrayList info(){
		ArrayList<Float> lst = new ArrayList<Float>();
		
		lst.add(12.16f);
		lst.add(46.1665f);
		lst.add(14.164f);
		return lst;
	}
	
}

interface X {}

class Z implements X {}

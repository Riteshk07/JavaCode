import java.util.ArrayList;

class A {
	public static void main (String [] args){
		ArrayList <? extends Number> x1 = new ArrayList<Integer>();
		
		x1.add(45);
		
		
		System.out.println(x1);
	}
	
	static void pro(ArrayList lst){
		
		
	}
	
}

/*
 error: incompatible types: int cannot be converted to CAP#1
                x1.add(45);
                       ^
  where CAP#1 is a fresh type-variable:
    CAP#1 extends Number from capture of ? extends Number
Note: Some messages have been simplified; recompile with -Xdiags:verbose to get full output
*/
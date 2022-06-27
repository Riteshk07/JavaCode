import java.lang.reflect.Modifier;
public abstract class D{
	
}

class A {
	public static void main (String [] args){
		
		Class klass = D.class;
		
		System.out.println(klass);
		int t = klass.getModifiers();
		System.out.println(Modifier.toString(t));
	}
}

class Student{}
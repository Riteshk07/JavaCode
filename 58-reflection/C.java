import java.lang.reflect;
public abstract class C{
	
}

class A {
	public static void main (String [] args){
		
		Class klass = C.class;
		
		System.out.println(klass);
		System.out.println(klass.getModifiers());
	}
}

class Student{}
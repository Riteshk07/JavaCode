import java.io.Serializable;
class User {
	
}
class Student extends User implements Serializable, Cloneable  {
	
}

class A{
	public static void main (String [] args){
		Class klass = Student.class;
		Class kl = klass.getSuperclass();
		
		System.out.println(kl);
		System.out.println(kl.getName());
		
		
		Class[] kls = klass.getInterfaces();
		
		for (Class k : kls){
			System.out.println(k);
		}
	}
}
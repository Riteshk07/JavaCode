import java.lang.reflect.Field;

class Human{
	public char e = 'A';
	byte t =1;
}
class User extends Human{
	double r = 85.9;
	public long g =45;
}

class Student extends User {
	int y ;
	public float j =45.66f;
	String w;
	public Integer q =23;
}

class A {
	public static void main (String [] args)throws IllegalAccessException{
		Student st = new Student ();
		st.j = 12.656f;
		st.q = 100;
		Class klass = Student.class;
		Field [] fields = klass.getFields();
		
		for (Field f : fields){
			System.out.println(f.getName()+" -> "+f.get(st));
		}
	}
}

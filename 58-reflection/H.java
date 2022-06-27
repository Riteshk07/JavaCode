import java.lang.reflect.Field;

class Student {
	int y ;
	public float j =45.66f;
	String w;
	public Integer q =23;
}

class A {
	public static void main (String [] args)throws IllegalAccessException{
		Student st = new Student ();
		st.j = 78.656f;
		st.q = 98;
		Class klass = Student.class;
		Field [] fields = klass.getFields();
		
		for (Field f : fields){
			System.out.println(f.getName()+" -> "+f.get(st));
		}
	}
}
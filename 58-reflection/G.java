import java.lang.reflect.Field;

class Student {
	int y ;
	public float j;
	String w;
	public Integer q;
}

class A {
	public static void main (String [] args){
		Class klass = Student.class;
		Field [] fields = klass.getFields();
		
		for (Field f : fields){
			//System.out.println(f.getName());
			System.out.println(f);
		}
	}
}
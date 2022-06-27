class A {
	public static void main (String [] args) throws ClassNotFoundException{
		Student st= new Student();
		System.out.println("=========");
		Class klass = st.getClass();
	}
}

class Student{}
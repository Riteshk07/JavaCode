class User {
	
}
class Student extends User{
	
}

class A{
	public static void main (String [] args){
		Class klass = Student.class;
		Class kl = klass.getSuperclass();
		
		System.out.println(kl.getName());
	}
}
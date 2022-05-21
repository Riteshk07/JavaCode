import java.util.TreeSet;
class A {
	public static void main (String [] args){
		TreeSet<Student> x = new TreeSet<Student>();
		x.add(new Student("mohan", 12));
		x.add(new Student("rohan", 14));
		
		System.out.println(x);
		java.lang.ClassCastException: class Student cannot be cast to class java.lang.Comparable
	}
}

class Student {
	String name ;
	int age;
	Student (String name , int age){
		this.name = name;
		this.age = age;
	}
	public String toString (){
		return name+"-"+age;
	}
}
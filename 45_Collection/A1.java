import java.util.TreeSet;
class A {
	public static void main (String [] args){
		TreeSet<Student> x = new TreeSet<Student>();
		x.add(new Student("mohan", 12));
		x.add(new Student("rohan", 14));
		x.add(new Student("gohan", 15));
		x.add(new Student("iohan", 19));
		x.add(new Student("tohan", 11));
		System.out.println(x);
		// java.lang.ClassCastException:
		
	}
}

class Student {
	String name ;
	int age;
	static String abc = " abcdefghijklmnopqrstuvwxyz";
	 
	Student (String name , int age){
		this.name = name;
		this.age = age;
	}
	public String toString (){
		return name+"-"+age;
	}
}
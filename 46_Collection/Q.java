import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class A{
	public static void main (String [] args){
		ArrayList<Student> x = new ArrayList<Student>();
		Comparator<Student> y = new NameAsc();
		x.add(new Student("mohan",23));
		x.add(new Student("sohan",21));
		x.add(new Student("rohan",20));
		x.add(new Student("tohan",19));
		x.add(new Student("gohan",18));
		
		
		System.out.println(x);
		
		Collections.sort(x, y);
		
		System.out.println(x);
	}
}
class NameAsc implements Comparator<Student> {
	public int compare(Student s1, Student s2){
		return s1.name.compareTo(s2.name);
	}
}
class Student {
	String name;
	Integer age;
	Student (String name, Integer age){
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return name+"-"+age;
	}
}
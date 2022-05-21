import java.util.ArrayList;
import java.util.Collections;

class A{
	public static void main (String [] args){
		ArrayList<Student> x = new ArrayList<Student>();
		
		x.add(new Student("mohan",23));
		x.add(new Student("sohan",21));
		x.add(new Student("rohan",20));
		x.add(new Student("tohan",19));
		x.add(new Student("gohan",18));
		
		
		System.out.println(x);
		
		Collections.sort(x);
		
		System.out.println(x);
	}
}

class Student implements Comparable <Student>{
	String name;
	Integer age;
	Student (String name, Integer age){
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return name+"-"+age;
	}
	public int compareTo(Student s){
		return this.name.compareTo(s.name);
	}
	
}
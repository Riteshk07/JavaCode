
import java.util.Arrays;

class A{
	public static void main (String [] args ){
		Student [] x = {
			new Student("mohan",16),
			new Student("sohan",18),
			new Student("tohan",19),
			new Student("gohan",23),
			new Student("bohan",12)
		};
		for (Student t : x){
			System.out.print(t+" ");
		}
		System.out.println();
		Arrays.sort(x);
		for (Student t : x){
			System.out.print(t+" ");
		}
	}
}

class Student implements Comparable<Student>{
	String name;
	Integer age;
	Student (String name , Integer age ){
		this.name= name ;
		this.age = age ;
	}
	public String toString (){
		return name +"-"+age;
	}
	public int compareTo(Student s){
		return this.name.compareTo(s.name);
	} 
}
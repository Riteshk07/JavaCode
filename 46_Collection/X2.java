import java.util.Comparator;
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
		Comparator <Student> y = new NameS();
		for (Student t : x){
			System.out.print(t+" ");
		}
		System.out.println();
		Arrays.sort(x,y);
		for (Student t : x){
			System.out.print(t+" ");
		}
	}
}
class NameS implements Comparator<Student>{
	public int compare(Student e1, Student e2){
		return e1.name.compareTo(e2.name);
	}
}
class NameRS implements Comparator<Student>{
	public int compare(Student e1, Student e2){
		return e2.name.compareTo(e1.name);
	}
}
class AgeS implements Comparator<Student>{
	public int compare(Student e1, Student e2){
		return e1.age.compareTo(e2.age);
	}
}
class AgeRS implements Comparator<Student>{
	public int compare(Student e1, Student e2){
		return e2.age.compareTo(e1.age);
	}
}

class Student {
	String name;
	Integer age;
	Student (String name , Integer age ){
		this.name= name ;
		this.age = age ;
	}
	public String toString (){
		return name +"-"+age;
	}
	
}
import java.util.TreeSet;
import java.util.Scanner;
import java.util.Comparator;

class A {
	static Scanner sc = new Scanner(System.in);
	public static void main (String [] args){
		System.out.println("Enter 1-NameAO, 2-NameDo 3-AgeAO, 4-AgeDo: ");
		int val = sc.nextInt();
		Comparator com = null;
		
		switch(val){
			case 1:
				com = new NameAscSort();
				break;
			case 2:
				com = new NameDscSort();
				break;
			case 3:
				com = new AgeAscSort();
				break;
			case 4:
				com = new AgeDscSort();
				break;
		}
		
		TreeSet<Student> x = new TreeSet<Student>(com);
		x.add(new Student("mohan", 12));
		x.add(new Student("rohan", 14));
		x.add(new Student("gohan", 15));
		x.add(new Student("iohan", 19));
		x.add(new Student("tohan", 11));
		System.out.println(x);
		
		
	}
}
class NameAscSort implements Comparator{
	public int compare(Object o1, Object o2){
		int val=0;
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		return s1.name.compareTo(s2.name);
	}
}
class NameDscSort implements Comparator{
	public int compare(Object o1, Object o2){
		int val=0;
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		return s2.name.compareTo(s1.name);
	}
}

class AgeAscSort implements Comparator{
	public int compare(Object o1, Object o2){
		int val=0;
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		return s1.age.compareTo(s2.age);
	}
}
class AgeDscSort implements Comparator{
	public int compare(Object o1, Object o2){
		int val=0;
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		return s2.age.compareTo(s1.age);
	}
}


class Student{
	String name ;
	Integer age;
	static String abc = " abcdefghijklmnopqrstuvwxyz";
	 
	Student (String name , Integer age){
		this.name = name;
		this.age = age;
	}
	public String toString (){
		return name+"-"+age;
	}
} 
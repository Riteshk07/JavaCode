import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;

class A{
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String [] args){
		int val = sc.nextInt();
		Comparator<Student> com = null;
		
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
		PriorityQueue <Student>s = new PriorityQueue<Student>(com);
		
		s.offer(new Student("mohan", 12));
		s.offer(new Student("tohan", 15));
		s.offer(new Student("sohan", 16));
		s.offer(new Student("rohan", 19));
		s.offer(new Student("dohan", 13));
		
		for (int i=0; i<5; i++){
			System.out.println(s.poll());
		}
	}
}

class NameAscSort implements Comparator<Student>{
	public int compare(Student o1, Student o2){
		
		return o1.name.compareTo(o2.name);
	}
}
class NameDscSort implements Comparator<Student>{
	public int compare(Student o1, Student o2){
		
		return o2.name.compareTo(o1.name);
	}
}

class AgeAscSort implements Comparator<Student>{
	public int compare(Student o1, Student o2){
		
		return o1.age.compareTo(o2.age);
	}
}
class AgeDscSort implements Comparator<Student>{
	public int compare(Student o1, Student o2){
		
		return o2.age.compareTo(o1.age);
	}
}


class Student {
	String name ;
	Integer age;
	
	Student (String name, Integer age){
		this.name= name;
		this.age= age;
	}
	
	public String toString (){
		return name+" - "+age;
	}
}

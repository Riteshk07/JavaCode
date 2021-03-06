import java.util.PriorityQueue;
import java.util.Scanner;

class A{
	static Scanner sc = new Scanner(System.in);
	static int val = sc.nextInt();
	public static void main (String [] args){
		PriorityQueue <Student>s = new PriorityQueue<Student>();
		
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

class Student implements Comparable<Student>{
	String name ;
	Integer age;
	public int compareTo(Student s){
		if(A.val==1){
			return this.name.compareTo(s.name);
		}else if(A.val==2){
			return s.name.compareTo(this.name);
		}else if(A.val==3){
			return this.age.compareTo(s.age);
		}else if(A.val==4){
			return s.age.compareTo(this.age);
		}else{
			return this.name.compareTo(s.name);
		}
	}
	Student (String name, Integer age){
		this.name= name;
		this.age= age;
	}
	
	public String toString (){
		return name+" - "+age;
	}
}

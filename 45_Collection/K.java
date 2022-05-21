import java.util.PriorityQueue;
// ordered and sorted

class A{
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
	
	Student (String name, Integer age){
		this.name= name;
		this.age= age;
	}
	public int compareTo(Student s){
		return this.name.compareTo(s.name);
	}
	
	public String toString (){
		return name+" - "+age;
	}
}

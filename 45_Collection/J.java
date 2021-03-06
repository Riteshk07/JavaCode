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

/*java.lang.ClassCastException:
	at java.base/java.util.PriorityQueue.siftUpComparable(PriorityQueue.java:658)
	at java.base/java.util.PriorityQueue.siftUp(PriorityQueue.java:654)
	at java.base/java.util.PriorityQueue.offer(PriorityQueue.java:345)
	at A.main(J.java:8)

*/

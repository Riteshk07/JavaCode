import java.util.TreeMap;
class A {
	public static void main (String [] args){
		TreeMap <Student, Integer> x = new TreeMap<Student, Integer>();
		x.put(new Student ("mahesh",19),89);
		x.put(new Student ("suresh",16),79);
		x.put(new Student ("ramesh",18),99);
		x.put(new Student ("jitesh",17),89);
		System.out.println(x);
		System.out.println(x.firstKey());
		System.out.println(x.lastKey());
	}
}

class Student implements Comparable<Student>{
	String name;
	Integer age;
	
	Student (String name, Integer age){
		this.name = name;
		this.age = age ;
	}
	public String toString (){
		return name+" - "+age;
	}
	public int compareTo(Student s){
		return this.name.compareTo(s.name);
		
	}
}
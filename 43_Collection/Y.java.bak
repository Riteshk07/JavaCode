import java.util.ArrayList;

class A{
	
	
	public static void main (String [] args){
		Student s1 = new Student("mohan",12);
		Student s2 = new Student("tohan",13);
		Student s3 = new Student("sohan",14);
		Student s4 = new Student("gohan",15);
		Student s5 = new Student("rohan",16);
		
		ArrayList<Student> x = new ArrayList<Student>();
		x.add(s1);
		x.add(s2);
		x.add(s3);
		x.add(s4);
		x.add(s5);
		
		Student w = new Student ("sohan", 14);
		System.out.println(x);
		// System.out.println(x.remove(w));
		System.out.println(x.contains(w));
		System.out.println(x);
	}
}

class Student {
	String name ;
	int age;
	
	public boolean equals(Object o){
		Student x = this;
		Student y = (Student)o;
		System.out.println(x.name+" -- "+y.name);
		return x.name.equals(y.name) && x.age==y.age; 
	}
	Student (String name , int age){
		this.name= name;
		this.age=age;
	}
	public String toString(){
		return "Name: "+this.name+"  Age: "+this.age;
	}
	
}




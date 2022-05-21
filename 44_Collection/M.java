import java.util.HashSet;

class A{
	public static void main (String [] args){
		Student x = new Student("mohan",12);
		A y = new A();
		x.equals(y);	// java.lang.ClassCastException:
	}
}

class Student {
	String name;
	int age;
	Student (String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		return "Name: "+name+" -  Age: "+age;
	}
	
	public boolean equals(Object o){

		Student x = this;
		Student y = (Student)o;
		System.out.println(x.name+" -- "+y.name);
		return x.name.equals(y.name) && x.age==y.age;
	}
	
}
import java.util.HashSet;

class A{
	public static void main (String [] args){
		Student x = new Student("mohan",12);
		Student x1 = new Student("mohan",12);
		A y = new A();
		System.out.println(x.equals(x1));	
		System.out.println(x.equals(y));	
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
		boolean flag = false;
		if (o instanceof Student){
			Student x = this;
			Student y = (Student)o;
			System.out.println(x.name+" -- "+y.name);
			flag = x.name.equals(y.name) && x.age==y.age;
		}
		return flag;
	}
	
}
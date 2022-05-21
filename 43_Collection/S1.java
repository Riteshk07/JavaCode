class A{
	public static void main (String [] args){
		Student s1 = new Student("mohan",12);
		Student s2 = new Student("tohan",13);
		Student s3 = new Student("sohan",14);
		Student s4 = new Student("gohan",15);
		Student s5 = new Student("rohan",16);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
	}
}

class Student {
	String name ;
	int age;
	
	Student (String name , int age){
		this.name= name;
		this.age=age;
	}
	public String toString(){
		return "Name: "+this.name+"  Age: "+this.age;
	}
}


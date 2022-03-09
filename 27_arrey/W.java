class Student {
	String name;
	int age;
	public String toString(){
		return name+" Age: "+age;
	}
	Student(String name, int age){
		this.name= name;
		this.age=age;
	}
}

class A {
	public static void main (String[]args){
		Student [] x = new Student[2];

		System.out.println(x[0]);
		System.out.println(x[1]);

		x[0]= new Student("Ritesh",21);
		x[1]= new Student("Rajkumar",20);

		System.out.println(x[0]);
		System.out.println(x[1]);
	}
}
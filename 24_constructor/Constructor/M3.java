class Student {
	String name;
	int age;
	Student(String name, int age){
		this.name = name;
		this.age=age;
	}
	public static void main (String[]args){
		Student s1 = new Student("Raghav",19);
		System.out.println(s1.name);
		System.out.println(s1.age);
	}
}
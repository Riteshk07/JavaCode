class Student{
	String name;
	int age;

	public static void main(String[]args){
		Student [] x= new Student[2];
		System.out.println(x[0]);
		System.out.println(x[1]);

		x[0]=new Student("Bholu",12);;
		x[1]=new Student("Golu",12);

		System.out.println(x[0]);
		System.out.println(x[1]);
	}
	
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
}
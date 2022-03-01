class Student {
	String name;
	int age;

	Student(){
		
		this.showInfo();
		System.out.println(this.name="Ritesh");
		System.out.println(this.age=22);
	}
	public static void main(String[]args){

		Student s1 = new Student();
		
	}
	void showInfo(){
		System.out.println("This is method");
	}
}
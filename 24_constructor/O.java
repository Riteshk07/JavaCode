import java.util.Scanner;
class Student {
	String name;
	int age;

	Student(){
		
		this.showInfo();
        name=new Scanner(System.in).next();
        age=new Scanner(System.in).nextByte();
		System.out.println("My name is "+this.name);
		System.out.println("My Age is "+this.age);
	}
	public static void main(String[]args){

		Student s1 = new Student();
        Student s2 = new Student();
	}
	
	void showInfo(){
		System.out.println("This is method");
	}
}
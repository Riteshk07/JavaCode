import java.util.Scanner;
import java.io.Console;
class User {
	String name,degree,branch,qualification;
    int age, salary;
}
class Student extends User {
	Student (){
        this.name = System.console().readLine();
        this.age = new Scanner(System.in).nextByte();
        this.degree = new Scanner(System.in).next();
        this.branch = new Scanner(System.in).next();
		System.out.println ("Student info:");
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Degree: "+this.degree);
		System.out.println("Branch: "+this.branch);
        System.out.println("\n");
	}
}
class Teacher extends User{
	Teacher (){
        this.name = System.console().readLine();
        this.age = new Scanner(System.in).nextByte();
        this.qualification = new Scanner(System.in).next();
        this.salary = new Scanner(System.in).nextInt();
        System.out.println ("Teacher info:");
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Qualification: "+this.qualification);
		System.out.println("Salary: "+this.salary);
        System.out.println("\n");
    }
}
class X {
	public static void main (String[]args){
		for(int i=1; i<=10; i++){
			new Student ();
		}
		for(int i=1; i<=10; i++){
			new Teacher ();
		}
	}
}
import java.util.Scanner;
import java.io.Console;
class User {
	String name,degree,branch,qualification;
    int age, salary;
}
class Student extends User {
	void studentInfo(){
        name = System.console().readLine();
        age = new Scanner(System.in).nextByte();
        degree = new Scanner(System.in).next();
        branch = new Scanner(System.in).next();
		System.out.println ("Student info:");
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Degree: "+this.degree);
		System.out.println("Branch: "+this.branch);
        System.out.println("\n");
    }
}
class Teacher extends User{
	void teacherInfo (){
        name = System.console().readLine();
        age = new Scanner(System.in).nextByte();
        qualification = new Scanner(System.in).next();
        salary = new Scanner(System.in).nextInt();
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
		new Student().studentInfo();
        new Student().studentInfo();
		new Teacher().teacherInfo();
        new Teacher().teacherInfo();
	}
}
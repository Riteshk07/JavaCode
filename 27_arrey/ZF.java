import java.io.Console;
import java.util.Scanner;
class A {
	public static void main (String[]args){
        System.out.print("How many student records: ");
        int len = new Scanner(System.in).nextInt();

		Student [] x = new Student[len];
		for (int i = 0; i<x.length; i++){
			System.out.print("Enter your name: ");
            String name = new Scanner(System.in).next();

            System.out.print("Enter your age: ");
            int age = new Scanner(System.in).nextInt();

            x[i]= new Student(name, age);
		}
		// for (int i =0; i<x.length; i++){
		// 	System.out.println(x[i]);
		// }
        System.out.println("##############################");
		for (Student y : x){
			System.out.println(y);
		}
	}
}
class Student {
	String name;
	int age;
	Student (String name,int age){
		this.name= name;
		this.age = age;
	}
	public String toString(){
		return "Student Name: "+name+" Student Age: "+age;
	}
}
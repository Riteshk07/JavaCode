class User {
	String name; int age;
}
class Student extends User {
	String degree; String branch;
	Student (String name, int age, String degree, String branch){
		this.name = name ;
		this.age = age;
		this.degree = degree;
		this.branch= branch;
	}
}
class Teacher extends User{
	String qualification; int salary;
	Teacher (String name, int age, String qualification, int salary){
		this.name = name ;
		this.age = age;
		this.qualification = qualification;
		this.salary = salary;
    }
}

class X {
	public static void main (String[]args){
		Student s = new Student ("Jatin prasad", 20,"BE","IT");
		
		Teacher t = new Teacher("R A Verma", 42, "PHd",120000);

		System.out.println ("Student info:");
		System.out.println("Name: "+s.name);
		System.out.println("Age: "+s.age);
		System.out.println("Degree: "+s.degree);
		System.out.println("Branch: "+s.branch);
		System.out.println("\n");
		
		System.out.println ("Teacher info:");
		System.out.println("Name: "+t.name);
		System.out.println("Age: "+t.age);
		System.out.println("Qualification: "+t.qualification);
		System.out.println("Salary: "+t.salary);
	}
}

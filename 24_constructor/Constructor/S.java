class Student{
	String name; int age; String degree; String branch;
}
class Teacher{
	String name; int age; String qualification; int salary;
}

class X {
	public static void main (String[]args){
		Student s = new Student ();
		s.name = "om prasad";
		s.age = 23;
		s.degree = "BTech";
		s.branch = "CS";
		
		Teacher t = new Teacher();
		t.name = "vigyan singh";
		t.age = 34;
		t.qualification = "MTech";
		t.salary = 23000;

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
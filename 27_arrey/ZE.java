class A {
	public static void main (String[]args){
		Student [] x = {new Student("om",12),new Student("Ram",15),new Student("Ghanshyam",20)};
		// for (int i = 0; i<x.length; i++){
		// 	System.out.println("Student Name: "+x[i].name+" Student Age: "+x[i].age);
		// }
		// for (int i =0; i<x.length; i++){
		// 	System.out.println(x[i]);
		// }
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
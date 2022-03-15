class A{
	public static void main (String[]args){
		Student[][] x ={
			{new Student ("a1",12),new Student ("a2",13),new Student ("a3",14)},
			{new Student ("a4",18),new Student ("a5",19),new Student ("a6",15)}
		};
		for (Student[] y : x ){
			for (Student t : y){
				System.out.print(t+" --> ");
			}
			System.out.println();
		}
	}
}

class Student {
	String name;
	int age;

	public String toString(){
		return name+"-"+age;
	}
	Student(String name, int age){
		this.name=name;
		this.age= age;
	}
}
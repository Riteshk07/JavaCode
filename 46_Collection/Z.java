import java.util.Arrays;

class A{
	public static void main (String [] args){
		Student [] x = {
			new Student("mohan",16),
			new Student("sohan",18),
			new Student("tohan",19),
			new Student("gohan",23),
			new Student("bohan",12)
		};
		Arrays.sort(x);
		for (Student t : x){
			System.out.print(t+" - ");
		}
		Student y = new Student("gohan", 13);
		System.out.println(Arrays.binarySearch(x,y));
	}
}

class Student implements Comparable <Student>{
	String name;
	Integer age;
	Student(String name, Integer age ){
		this.name = name;
		this.age = age;
	}
	public String toString (){
		return name+"-"+age;
	}
	public int compareTo(Student s ){
		return this.name.compareTo(s.name);
	}
}
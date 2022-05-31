import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;
class A{
	static Scanner sc = new Scanner (System.in);
	public static void main (String [] args){
		int val = sc.nextInt();
		int z=0;
		Student [] x = {
			new Student("mohan",16),
			new Student("sohan",18),
			new Student("tohan",19),
			new Student("gohan",23),
			new Student("bohan",12)
		};
		Comparator <Student> com = null;
		Student y = new Student("sohan", 12);
		if (val==1){
			com = new NameS();
		} else if (val==2){
			com = new NameRS();
		}else if (val==3){
			com = new AgeS();
		}else if (val==4){
			com = new AgeRS();
		}
		Arrays.sort(x, com);
		for (Student t : x){
			System.out.print(t+" - ");
		}
		z= Arrays.binarySearch(x,y,com);
		System.out.println();
		System.out.println(z);
	}
}
class NameS implements Comparator <Student>{
	public int compare(Student s1, Student s2){
		return s1.name.compareTo(s2.name);
	}
}
class NameRS implements Comparator <Student>{
	public int compare(Student s1, Student s2){
		return s2.name.compareTo(s1.name);
	}
}
class AgeS implements Comparator <Student>{
	public int compare(Student s1, Student s2){
		return s1.age.compareTo(s2.age);
	}
}
class AgeRS implements Comparator <Student>{
	public int compare(Student s1, Student s2){
		return s2.age.compareTo(s1.age);
	}
}

class Student {
	String name;
	Integer age;
	Student(String name, Integer age ){
		this.name = name;
		this.age = age;
	}
	public String toString (){
		return name+"-"+age;
	}
}
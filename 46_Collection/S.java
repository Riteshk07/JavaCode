import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

class  A{
	public static void main (String [] args){
		ArrayList<Employee> x = new ArrayList<Employee>();
		
		x.add(new Employee("Munna", 23));
		x.add(new Employee("Kaleen", 50));
		x.add(new Employee("Guddu", 24));
		x.add(new Employee("Bablu", 26));
		x.add(new Employee("Gajgamini", 21));

		Collections.sort(x, new NameS());
		System.out.println(x);
		Collections.sort(x, new NameRS());
		System.out.println(x);
		Collections.sort(x, new AgeS());
		System.out.println(x);
		Collections.sort(x, new AgeRS());
		System.out.println(x);
	}
}
class NameS implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2){
		return e1.name.compareTo(e2.name);
	}
}
class NameRS implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2){
		return e2.name.compareTo(e1.name);
	}
}
class AgeS implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2){
		return e1.age.compareTo(e2.age);
	}
}
class AgeRS implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2){
		return e2.age.compareTo(e1.age);
	}
}
class Employee {
	String name;
	Integer age;
	Employee(String name, Integer age){
		this.name = name;
		this.age = age;
	}
	public String toString (){
		return name+"-"+age;
	}
}
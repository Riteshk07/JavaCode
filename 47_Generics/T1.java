import java.util.ArrayList;
import java.util.Map;

class A {
	public static void main (String [] args ){
		ArrayList<?> a1 = new ArrayList<Student>();
		ArrayList<? > a2 = new ArrayList<Employee>();
		ArrayList<?> a3 = new ArrayList<User>();
		ArrayList<?> a4 = new ArrayList<Map>();
		ArrayList<?> a5 = new ArrayList<ArrayList>();
		ArrayList<?> a6 = new ArrayList<Bus>();
	}
}

interface User {}

class Student implements User{}
class Employee implements User{}
class Bus{}
import java.util.ArrayList;
import java.util.Map;

class A {
	public static void main (String [] args ){
		ArrayList<? extends Object> a1 = new ArrayList<Student>();
		ArrayList<? extends Object> a2 = new ArrayList<Employee>();
		ArrayList<? extends Object> a3 = new ArrayList<User>();
		ArrayList<? extends Object> a4 = new ArrayList<Map>();
		ArrayList<? extends Object> a5 = new ArrayList<ArrayList>();
		ArrayList<? extends Object> a6 = new ArrayList<Bus>();
	}
}

interface User {}

class Student implements User{}
class Employee implements User{}
class Bus{}
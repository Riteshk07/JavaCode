import java.util.ArrayList;
import java.util.Map;

class A {
	public static void main (String [] args ){
		ArrayList<?> a1 = new ArrayList<Student>();
		ArrayList<Object> a2= new ArrayList<>();
		ArrayList<? extends Object> a3= new ArrayList<>();
	}
}

interface User {}

class Student implements User{}
class Employee implements User{}
class Bus{}
import java.util.ArrayList;

class A {
	public static void main (String [] args){
		ArrayList<Animal> x = new ArrayList<Cat>();
		
	}
}

class Animal{}

class Cat extends Animal{}
class Dog extends Animal{}

/*
 error: incompatible types: ArrayList<Cat> cannot be converted to ArrayList<Animal>
 * element type on both side must be same.
*/
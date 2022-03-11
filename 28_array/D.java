class A {
	public static void main (String[]args){
		Animal [] x = new Dog [0];
		x[0]= new Dog ();
		x [1] = new Cat ();
	}
} 
class Animal {}
class Cat extends Animal{}
class Dog extends Animal{}

// java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
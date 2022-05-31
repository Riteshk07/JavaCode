import java.util.ArrayList;

class A {
	public static void main (String [] args){
		ArrayList <Animal> x = new ArrayList<Animal>();

		x.add(new Cat());
		x.add(new Dog());
		x.add(new Animal());
		x.add(new BDog());
		x.add(new Cow());
		System.out.println(x);
	}
}

class Animal{}

class Cat extends Animal{}
class Dog extends Animal{}
class BDog extends Dog{}
class Cow extends Animal{}
import java.util.ArrayList;

class A {
	public static void main (String[] args){
		// ArrayList <Integer>x = new ArrayList<Integer>();
		// ArrayList <Number>x = new ArrayList<Integer>();
		
		
		Animal [] x = new Dog [2];
		x[0] = new Dog();
		x[1]= new Cat();
	}
}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}


/*
Exception in thread "main" java.lang.ArrayStoreException: Cat
        at A.main(C1.java:11)
*/
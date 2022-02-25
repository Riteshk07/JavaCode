class A {
	Animal pro(){
		return null;
	}
}

class B extends A {
	// overriding method
	// return type matches with the return type of overriding method 
	Animal pro(){
		return null;
	}
}

class Animal{}

class Dog extends Animal{}

class BDog extends Dog {}

// Animal x = null;
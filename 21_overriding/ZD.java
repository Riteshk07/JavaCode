class Animal {
	void makeSound(){
		System.out.println("Animal Sound");
	}
}
class Cat extends Animal{
	void makeSound(){
		System.out.println("Cat Sound");
	}
}
class Dog extends Animal {
	void makeSound(){
		System.out.println("Dog Sound");
	}
}
class X {
	public static void main(String[]args){
		Animal a =null;
		a= new Animal();
		a.makeSound();
		a= new Cat();
		a.makeSound();
		a= new Dog();
		a.makeSound();
	// Runtime pplymorphism: decide at runtime, whic method(instance) version to call
	// Runtime polymorphism uses dynamic method dispatch to decide which method version to call
	}
}
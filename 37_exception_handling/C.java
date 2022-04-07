class A {
    public static void main(String[] args) {
        System.out.println("A");

        Animal x = new Cat();
        Dog t = (Dog)x;

        System.out.println("B");
    }
}

class Animal { }
class Cat extends Animal { }
class Dog extends Animal { }
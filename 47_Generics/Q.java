import java.util.ArrayList;

class A {
    public static void main(String[] args) {
        ArrayList<? super Dog> a1 = new ArrayList<Dog>();
        // ArrayList<? super Dog> a2 = new ArrayList<BDog>();
        ArrayList<? super Dog> a3 = new ArrayList<Animal>();
        ArrayList<? super Dog> a4 = new ArrayList<LivingBeing>();
        ArrayList<? super Dog> a5 = new ArrayList<Object>();
        
    }
}

class LivingBeing{}

class Animal extends LivingBeing{}

class Cat extends Animal{}
class Dog extends Animal{}
class Cow extends Animal{}
class BDog extends Dog{}
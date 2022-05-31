import java.util.ArrayList;

class A {
    public static void main(String[] args) {
		int t = Integer.parseInt(args[0]);
        ArrayList<? super Dog> a = null;
		
		if (t==1){
			a = pro();
		}else if (t==2){
			a = info();
		}
		System.out.println(a);
    }
	static ArrayList pro(){
		ArrayList<Animal> lst = new ArrayList<Animal>();
		
		lst.add(new Animal());
		lst.add(new Cat());
		lst.add(new Cow());
		return lst;
	}
	static ArrayList info(){
		ArrayList<Dog> lst = new ArrayList<Dog>();
		
		lst.add(new Dog());
		lst.add(new BDog());
		return lst;
	}
}

class LivingBeing{}

class Animal extends LivingBeing{}

class Cat extends Animal{}
class Dog extends Animal{}
class Cow extends Animal{}
class BDog extends Dog{}
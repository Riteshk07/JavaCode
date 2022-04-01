class A{
	public static void main (String[]args){
		LivingBeing x = new BDog();
		System.out.println(x);
		BDog y = x;		// error: incompatible types: LivingBeing cannot be converted to BDog
		y.pro();
	}
}
class LivingBeing{
	
}

class Animal extends LivingBeing{
	
}

class Cat extends Animal{

}
class Dog extends Animal{

} 
class Cow extends Animal{

}
class BDog  extends Animal{
	void pro(){
		System.out.println("this is BDog");
	}
}

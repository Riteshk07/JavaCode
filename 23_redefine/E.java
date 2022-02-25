class A{
	void pro(SportsCar s){
		System.out.println("Sports Car");
	}
	void pro(Car c){
		System.out.println("Car");
	}
}

class X {
	public static void main(String[]args){
		Car ca = new SportsCar();
		A x = new A();
		x.pro(ca);
	}
}
class Car{}
class SportsCar extends Car{}
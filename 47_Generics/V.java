import java.util.ArrayList;

class A {
	public static void main (String [] args ){
		Rental<Car> carR = new Rental<Car>();
		Rental<Bus> busR = new Rental<Bus>();
		
		Car c1 = new Car("Car1");
		Car c2 = new Car("Car2");
		carR.addR(c1);
		carR.addR(c2);
		
		Bus b1 = new Bus("Bus1");
		Bus b2 = new Bus("Bus2");
		busR.addR(b1);
		busR.addR(b2);
		
		System.out.println(carR.getR());
		System.out.println(busR.getR());
		
	}
}

class Car {
	String name;
	Car(String name){
		this.name= name;
	}
	public String toString(){
		return name;
	}
}
class Bus {
	String name;
	Bus(String name){
		this.name= name;
	}
	public String toString(){
		return name;
	}
}
class Rental<T>{
	ArrayList<T> x = new ArrayList<T>();
	void addR(T t){
		x.add(t);
	}
	T getR(){
		return x.remove(0);
	}
}


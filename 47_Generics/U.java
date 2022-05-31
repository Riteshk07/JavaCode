import java.util.ArrayList;

class A {
	public static void main (String [] args ){
		Car car = new Car();
		RentCar rc = new RentCar();
		rc.addCar(car);
		Car a= rc.getCar(); 
	}
}

class Car {}
class RentCar{
	ArrayList<Car> x = new ArrayList<Car>();
	void addCar(Car c){
		x.add(c);
	}
	Car getCar(){
		return x.remove(0);
	}
}
class Bus {}
class RentBus{
	ArrayList<Bus> x = new ArrayList<Bus>();
	void addBus(Bus b){
		x.add(b);
	}
	Bus getBus(){
		return x.remove(0);
	}
}
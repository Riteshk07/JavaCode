class Car {
	void driveCar(){
		System.out.println("driveCar in car");
	}
}

class SportsCar extends Car{
	void driveCar(){System.out.println("driveCar in SportsCar");}
}
class LuxuryCar extends Car{
	void driveCar(){System.out.println("driveCar in LuxuryCar");}
}
class SpaceCar extends Car {
	void driveCar(){System.out.println("driveCar in SpaceCar");} 
}

class CarRental{
	SportsCar rentSportsCar (){
		SportsCar x = new SportsCar();
		return x;
	}
	LuxuryCar rentLuxuryCar (){
		LuxuryCar x = new LuxuryCar();
		return x;
	}
	SpaceCar rentSpaceCar (){
		SpaceCar x = new SpaceCar();
		return x;
	}
}
class TestCar{
	public static void main (String[]args){
		CarRental cr = new CarRental();
		
		Car c = null;

		c = cr.rentSportsCar();
		c.driveCar();

		c = cr.rentSpaceCar();
		c.driveCar();

		c= cr.rentLuxuryCar();
		c.driveCar();
	}
}
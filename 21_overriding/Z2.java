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
    Car rentCar (int n){
        Car cr = null;
        if (n==1){
            cr = new SportsCar();
        }else if (n==2){
            cr= new LuxuryCar();
        }else{
            cr= new SpaceCar();
        }
        return cr;
    }
}
class TestCar{
	public static void main (String[]args){
		CarRental cr = new CarRental();
		
		Car c = null;

		c = cr.rentCar(1);
		c.driveCar();

		c = cr.rentCar(2);
		c.driveCar();

		c= cr.rentCar(3);
		c.driveCar();
	}
}
interface Runnable{
	void ride();
}
class Bicycle implements Runnable {
	public void ride(){System.out.println("Riding Bicycle");}
}
class RoadBicycle extends Bicycle{
	public void ride(){System.out.println("Riding Road Bicycle");}
}
class MountainBicycle extends Bicycle{
	public void ride(){System.out.println("Riding Mountain Bicycle");}
}
class TourBicycle extends Bicycle{
	public void ride(){System.out.println("Riding Tour Bicycle");}
}

class RentBicycle{
	Runnable proBicycle(int n){
		Runnable bi = null;
		if(n==1){
            bi = new RoadBicycle();}else if(n==2){bi= new MountainBicycle();}else{bi = new TourBicycle();}
        return bi;
    }
}
class Main {
	public static void main (String[]args){
		RentBicycle rb = new RentBicycle();
		Runnable b = null;
		b = rb.proBicycle(1);
		b.ride();
		b = rb.proBicycle(2);
		b.ride();
		b = rb.proBicycle(3);
		b.ride();
	}
}
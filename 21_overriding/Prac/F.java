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
class Main {
	public static void main (String[]args){
		Runnable b = new MountainBicycle();
		b.ride();
		b = new RoadBicycle();
		b.ride();
		b = new TourBicycle();
		b.ride();
	}
}
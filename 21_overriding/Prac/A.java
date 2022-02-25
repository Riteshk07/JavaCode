class Bicycle {
	void ride(){System.out.println("Riding Bicycle");}
}
class RoadBicycle extends Bicycle{
	void ride(){System.out.println("Riding RoadBicycle");}
}
class MountainBicycle extends Bicycle{
	void ride(){System.out.println("Riding MountainBicycle");}
}
class TourBicycle extends Bicycle{
	void ride(){System.out.println("Riding TourBicycle");}
}

class RentBicycle{
	RoadBicycle proRoad(){
		RoadBicycle x = new RoadBicycle();
		return x;
	}
	MountainBicycle proMountain(){
		MountainBicycle x = new MountainBicycle();
		return x;
	}
	TourBicycle proTour (){
		TourBicycle x = new TourBicycle();
        return x;
	}
}
class Main {
	public static void main (String[]args){
		RentBicycle rb = new RentBicycle();
		Bicycle b = null;
		b = rb.proRoad();
		b.ride();
		b= rb.proMountain();
		b.ride();
		b=rb.proTour();
		b.ride();
	}
}
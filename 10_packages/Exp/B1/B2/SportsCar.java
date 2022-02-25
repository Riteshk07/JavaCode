package B1.B2;
public class SportsCar extends Car {
    public void getInfo(){
        name="Ferrari 488";
        emissionStandard="BS4";
        mileageKmpl=8.77f;
        airBags=4;
        topSpeedmph=205;
        System.out.println("Model Name: "+name+"\nFuel Type: "+fuel_type+"\nDrivetrain: "+drivetrain+"\nEmission Standard: "+emissionStandard+"\nMileage (kmpl): "+mileageKmpl+"\nAir Bags: "+airBags+"\nTop Speed (mph): "+topSpeedmph);
    }
}
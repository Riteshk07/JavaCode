package B1.B2;
public class LuxuryCar extends Car {
    public void getInfo(){
        name="Mercedes-Benz AMG GT";
        emissionStandard="BS6";
        mileageKmpl=8.06f;
        airBags=6;
        topSpeedmph=196;
        System.out.println("Model Name: "+name+"\nFuel Type: "+fuel_type+"\nDrivetrain: "+drivetrain+"\nEmission Standard: "+emissionStandard+"\nMileage (kmpl): "+mileageKmpl+"\nAir Bags: "+airBags+"\nTop Speed (mph): "+topSpeedmph);
    }
}

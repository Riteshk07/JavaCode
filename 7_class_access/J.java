class Main{
    public static void main(String[] args) {
        SportsCar s = new SportsCar();
        s.getInfo();
        LuxuryCar l = new LuxuryCar();
        l.getInfo();
    }
}
class Car {
    String name;
    static String fuel_type="Petrol";
    static String drivetrain="RWD";
    String emissionStandard;
    float mileageKmpl;
    byte airBags;
    short topSpeedmph;

}

// SportsCar IS-A Car
class SportsCar extends Car {
    void getInfo(){
        name="Ferrari 488";
        emissionStandard="BS4";
        mileageKmpl=8.77f;
        airBags=4;
        topSpeedmph=205;
        System.out.println("Model Name: "+name+"\nFuel Type: "+fuel_type+"\nDrivetrain: "+drivetrain+"\nEmission Standard: "+emissionStandard+"\nMileage (kmpl): "+mileageKmpl+"\nAir Bags: "+airBags+"\nTop Speed (mph): "+topSpeedmph);
    }
}

// LuxuryCar IS-A Car
class LuxuryCar extends Car {
    void getInfo(){
        name="Mercedes-Benz AMG GT";
        emissionStandard="BS6";
        mileageKmpl=8.06f;
        airBags=6;
        topSpeedmph=196;
        System.out.println("Model Name: "+name+"\nFuel Type: "+fuel_type+"\nDrivetrain: "+drivetrain+"\nEmission Standard: "+emissionStandard+"\nMileage (kmpl): "+mileageKmpl+"\nAir Bags: "+airBags+"\nTop Speed (mph): "+topSpeedmph);
    }
}


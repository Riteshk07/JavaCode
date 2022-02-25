package A;
import A.B.*;
class Main {
    public static void main(String[]args){
        RoadBicycle rb = new RoadBicycle();
        rb.frame();
        RoadBicycle.pedals();
        RoadBicycle.frameMaterial();
        rb.breakType();

        MountainBicycle mb = new MountainBicycle();
        mb.frame();
        MountainBicycle.pedals();
        MountainBicycle.frameMaterial();
        mb.breakType();
    }
}

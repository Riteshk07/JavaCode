interface Jumpable{
    void jumpTechnique();
    void jumpL();
}
interface Biteable{
    void biteForce();
}
abstract class Dog implements Biteable,Jumpable{
    void info(){
        System.out.println("Dog's Breed");
    }
}
class StreetDogs extends Dog {
    String name;
    void dogs(){
        System.out.println(name);
    }
    public void jumpTechnique(){
        System.out.println("Force generate to front legs to jump");
    }
    public void jumpL(){
        System.out.println("street dogs can jump 8 feet");
    }
    public void biteForce(){
        System.out.println("bite force of street dogs is: 150-200 PSI");
    }
}
class GermanShepherd extends Dog {
    String name;
    void dogs(){
        System.out.println(name);
    }
    public void jumpTechnique(){
        System.out.println("Force generate to all legs to jump");
    }
    public void jumpL(){
        System.out.println("street dogs can jump 15 feet");
    }
    public void biteForce(){
        System.out.println("bite force of German Shepherd is: 240-280 PSI");
    }
}
class Main{
    public static void main(String[]args){
        StreetDogs sd =new StreetDogs();
        sd.info();
        sd.name="\nStreet Dog's";
        sd.dogs();
        sd.jumpTechnique();
        sd.jumpL();
        sd.biteForce();
        GermanShepherd gs =new GermanShepherd();
        gs.name = "\nGerman Shepherd";
        gs.dogs();
        gs.jumpTechnique();
        gs.jumpL();
        gs.biteForce();
    }
}
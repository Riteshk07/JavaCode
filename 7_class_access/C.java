import javax.sound.sampled.SourceDataLine;

class A{
    public static void main (String[] args){
        B x = new B();
        x.age =22;
        System.out.println(x.age);
        x.pro();
        
    }

}

class B {
    byte age;
    void pro(){
        System.out.println("Aur Batao\nSab badiya ");
    }

}

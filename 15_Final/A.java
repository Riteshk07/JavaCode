final class X{
    void pro(){
        System.out.println("Hello ji...\n Kese ho?");
    }
}
class A extends X{                       // error: cannot inherit from final X
    public static void main (String[]args){
        X a = new X();
        a.pro();
    }
}
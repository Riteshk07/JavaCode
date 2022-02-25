package a1.a2.a3;

class C extends A{
    public static void main (String [] args){
        A x = new A();          //error: pro() has private access in A
        x.pro();
    }
}
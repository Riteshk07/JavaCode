package a.a1;
import b.B;

class A extends B{
    void pro(int i)
    {
        System.out.println("A integer value: "+i);
    }
}
class X{
    public static void main(String[] args)
    {
        A m =new A();
        m.pro(true);
        m.pro(2);
        m.pro("Ritesh");
    }
}
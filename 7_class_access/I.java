class A extends B{
    public static void main (String[] args){
        A x = new A();
        x.radius=45;
        A x1 = new A();
        x1.radius=30;
        A x2 = new A();
        x2.radius=20;
        pro();
        x.pro1();
        pro();
        x1.pro1();
        pro();
        x2.pro1();
    }
}
class B {
    int radius;
    static float pi=22/7f;
    static void pro(){
        System.out.print("Area of Circle & Perimeter is: ");
    }
    void pro1(){
        System.out.println(pi*radius*radius +" & "+2*pi*radius);
    }

}

class Circle {
    int radius;
    static float pi = 3.14f;
    public static void main (String[]args){
        Circle c1 = new Circle();
        c1.radius= 40;
        Circle c2 = new Circle();
        c2.radius= 45;
        Circle c3 = new Circle();
        c3.radius= 35;
        Circle c4 = new Circle();
        c4.radius= 80;
        System.out.println("Area of circle 1 is: "+c1.radius*c1.radius* Circle.pi);
        System.out.println("Area of circle 2 is: "+c2.radius*c2.radius* Circle.pi);
        System.out.println("Area of circle 3 is: "+c3.radius*c3.radius* Circle.pi);
        System.out.println("Area of circle 4 is: "+c4.radius*c4.radius* Circle.pi);
    }
}
class Energy{
    float m;
    static double c=300000000;
    public static void main (String[] args){
        Energy e1 = new Energy();
        e1.m=1f;
        Energy e2 = new Energy();
        e2.m=1.5f;
        Energy e3 = new Energy();
        e3.m=0.5f;
        Energy e4 = new Energy();
        e4.m=0.8f;
        System.out.println("Total Energy of e1 is: "+e1.m*Energy.c*Energy.c);
        System.out.println("Total Energy of e2 is: "+e2.m*Energy.c*Energy.c);
        System.out.println("Total Energy of e3 is: "+e3.m*Energy.c*Energy.c);
        System.out.println("Total Energy of e4 is: "+e4.m*Energy.c*Energy.c);

    }
}
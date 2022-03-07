class A{
    int a=50;
    int[]x= new int [5];
    void pro(){
        System.out.println(x);
    }
    public static void main (String[]args){
        A y = new A();
        System.out.println(y.a);
        System.out.println(y.x);
        y.pro();

    }
}
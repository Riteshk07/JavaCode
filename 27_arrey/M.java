class A{
    int a=50;
    int[]x= new int [5];
    A(){
        System.out.println(x);
        System.out.println(x.length);
    }
    public static void main (String[]args){
        A y = new A();
        y.x= new int[3];
        System.out.println(y.x);
        System.out.println(y.x.length);
       

    }
}
class A{
    int t = 20;
    public static void main(String[] args) {
        B x = new B();
    }
}
class B extends A{
    B(){
        System.out.println(super.toString());
        System.out.println(super.t);
    }
    
}
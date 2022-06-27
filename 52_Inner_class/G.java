class A{
    private int abc = 23;
    protected class B{
        B(){
            super();
            System.out.println(super.toString());
        }
        void pro(){
            System.out.println(abc);
        }
    }
    public static void main (String [] args){
        A.B t = new A().new B();
    }
}
final class X{
    
}
class D /*extends X*/{                       // error: cannot inherit from final X
    public static void main (String[]args){
        X a;            // you can make variable 
        new X();        // you can call a constructor 
    }
}
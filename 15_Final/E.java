final class X{
    int t = 80;
}

class E /* extends X*/{
    public static void main (String []args){
        X a = new X();
        System.out.println(a.t);
        a.t = 64;
        System.out.println(a.t);    
    }
}
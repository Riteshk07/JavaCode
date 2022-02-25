final class X{
    static void pro(){                  // you can static mark
        System.out.println("Hello ji...\n\tKese ho ??");
    }
}
class C/*extends X*/{
    public static void main (String []args){
        X.pro();
    }
}
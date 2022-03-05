// error: illegal forward reference

class A { 
    {
        System.out.println(x);
    }

    static int x = 90;

    public static void main(String[] args) {
        new A();
    }
}
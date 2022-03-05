// error: illegal forward reference

class A {    

    static {
        System.out.println(y);
    }

    static int y = 90;

    public static void main(String[] args) {
        
    }
}
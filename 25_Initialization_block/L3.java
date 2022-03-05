//error: non-static variable x cannot be referenced from a static context

class A { 
    int x = 90;

    static {
        System.out.println(x);
    }   

    public static void main(String[] args) {
        new A();
    }
}
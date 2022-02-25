class A {
    public static void main(String[] args) {
        final int x;
        x=78;
        x=80;           //error: variable x might already have been assigned
        System.out.println(x);      
    }
}

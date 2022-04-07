class A {
    public static void main(String[] args) {
        System.out.println(pro());
    }

    static int pro() {
        Integer x = Integer.valueOf(234);
        
        return x; //Autoboxing->unboxing
    }
}
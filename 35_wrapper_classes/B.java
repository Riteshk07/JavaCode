class A {
    public static void main(String[] args) {
        // Boolean x = Boolean.valueOf(true);
        // Boolean x = Boolean.valueOf(false);
        Boolean x = Boolean.valueOf(0);   // error: no suitable method found for valueOf(int)

        System.out.println(x);
    }
}
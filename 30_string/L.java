class A {
    public static void main(String[] args) {
        String x = "mohanjodaro";

        // String y = x.substring(5);
        String y = x.substring(100);    // Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: -89

        System.out.println(x);
        System.out.println(y);
    }
}

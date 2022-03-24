class A {
    public static void main(String[] args) {
        char[] x = {'a','m','a','n'};
        String t = "aman";

        String y = String.valueOf(x);

        System.out.println(y);
        System.out.println(t==y);
    }
}
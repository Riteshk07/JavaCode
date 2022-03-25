class A {
    public static void main(String[] args) {
        String x = "mohan is my friend";

        String y = x.substring(5,12).trim().toUpperCase().replace("MY","YOUR");

        System.out.println(x);
        System.out.println(y);
    }
}

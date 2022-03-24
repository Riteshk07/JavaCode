class A {
    public static void main(String[] args) {
        String s = "ramanna";
        String x = "romonno";

        String t = s.replace('a', 'o');

        System.out.println(s);
        System.out.println(t);
        System.out.println(x == t);
    }
}
class A {
    public static void main(String[] args) {
        Integer x = Integer.valueOf(12);
        Integer y = Integer.valueOf(12);
        Integer z = Integer.valueOf(15);

        System.out.println(x.compareTo(y));
        System.out.println(x.compareTo(z));
        System.out.println(z.compareTo(x));
    }
}
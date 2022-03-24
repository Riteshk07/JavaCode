class A {
    public static void main(String[] args) {
        boolean x = "monu@gmail.com".matches("[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}");
        // boolean x = "m@onu@gmail.com".matches("[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}");
        // boolean x = "monu@gmail".matches("[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}");
        // boolean x = "monu@gmail.co.in".matches("[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}");

        System.out.println(x);
    }
}
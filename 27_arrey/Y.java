class A {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);
        System.out.println("#############################");

        System.out.println(args[1] + 2);
        System.out.println(Integer.parseInt(args[1]) + 2);

        System.out.println("#############################");

        System.out.println(args.length);
    }
}
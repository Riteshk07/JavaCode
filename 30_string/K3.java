class A {
    public static void main(String[] args) {
        String x = "mohan-87, ganesh-56, vikramaditya-89";

        String[] y = x.split("\\d\\d");

        for(String t : y) {
            System.out.println(">"+t+"<");
        }
    }
}
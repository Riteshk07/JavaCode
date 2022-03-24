class A {
    public static void main(String[] args) {
        String x = "Jabalpur, Jaipur, Jagdalpur, Kanpur, Nagpur";

        // String[] y = x.split(",");
        String[] y = x.split(", ");

        for(String t : y) {
            System.out.println(">"+t+"<");
        }
    }
}
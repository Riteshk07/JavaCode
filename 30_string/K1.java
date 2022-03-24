class A {
    public static void main(String[] args) {
        String x = "mohan is my friend he is a good person and he is a great singer";

        String[] y = x.split("is");

        for(String t : y) {
            System.out.println(">"+t+"<");
        }
    }
}
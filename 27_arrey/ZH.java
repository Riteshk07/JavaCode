class A {
    public static void main(String[] args) {
        char a = 'A';
        byte b = 2;
        short c = 234;
        int d = 5000;
        float e = 3.4f;
        double f = 4.5;

        int[] x = {a, b, c, d, e, f};
        // error: incompatible types: possible lossy conversion from float to int
        // error: incompatible types: possible lossy conversion from double to int
        for(int w : x) {
            System.out.println(w);
        }
    }
}
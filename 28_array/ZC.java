class A {
    public static void main(String[] args) {
        int[] x = {10,20,30,40,50,60};
        int[] y = new int[x.length];

        for(int i=0,j=x.length-1; i < x.length; i++,j--) {
            y[i] = x[j];
        }

        for(int t : y) {
            System.out.println(t+" -");
        }
    }
}
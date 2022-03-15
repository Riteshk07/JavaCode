class A {
    public static void main(String[] args) {
        int[] x = {10,20,30,40,50};

        int sum = 0;

        for(int y : x) {
            sum = sum + y;
        }

        System.out.println("total sum: "+sum);
    }
}
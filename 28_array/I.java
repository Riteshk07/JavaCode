class A {
    public static void main(String[] args) {
        int[] x = {45, 67, 12, 55, 23, 89};

        // int max = x[0];

        // for(int i = 1; i < x.length; i++) {
        //     // if(x[i] > max) {
        //     //     max = x[i];
        //     // }
        //     }
            for(int i = 1; i < x.length; i++) {
            if (x[i]>=x[0] && x[i]>=x[1] && x[i]>=x[2] && x[i]>=x[3] && x[i]>=x[4] && x[i]>=x[5]){
                System.out.println("maximum is: "+ x[i]);
            }
        }
    }
}
class A {
    public static void main(String[] args) {
        int count =0;
        int [] x = {20,19,18,17,16,15,14,13,12,11};
        for (int i=1; i<x.length; i++){
            if (x[i]<x[i-1]){

                x[i] =x[i]+ x[i-1];
                x[i-1] =x[i]- x[i-1];
                x[i] =x[i]- x[i-1];
                count +=1;
                i=0;

            }
            count +=1;

        }
        System.out.println(count);
        System.out.print("Sorted Array: ");
        for (int i=0; i<x.length; i++){
            System.out.print(x[i]+" ");
        }
    }
}
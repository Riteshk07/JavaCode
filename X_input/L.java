class A{
    public static void main (String []args){
        int [] x= {9,8,7,6,5,4,3,2,1,0};
        int count=0;
        // int i=1;
        for (int i = 0; i < x.length - 1; i++) {
            if (x[i] > x[i + 1]) {
                int p = x[i];
                x[i] = x[i + 1];
                x[i + 1] = p;
                i = -1;
            }
            count+=1;
        }
        
        System.out.println(count);
        for(int j= 0; j<x.length; j++){
            System.out.print(x[j]+" ");
        }
    }
}
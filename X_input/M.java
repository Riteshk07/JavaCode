class A {
    public static void main (String[]args){
        int n = 4;
        int a=0;
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (i<=j){
                    a+=1;
                    System.out.print(a+" ");
                }else{System.out.print("  ");}
            }
            System.out.println();
        }
    }
}
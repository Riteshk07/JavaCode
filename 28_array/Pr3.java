class A {
    public static void main (String[]args){
        int [] x= {12,45,89,56,47,62};
        int [] ans = new int [x.length];
        for (int i = 0; i<x.length; i++){
            ans[i]=x[i];
        }
        for (int y : ans){
            System.out.print(y+", ");
        }
        System.out.println(); 
        for (int i=x.length-1; i>-1; i-- ){
            System.out.print(ans[i]+", ");
        }
    }
}
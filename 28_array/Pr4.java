class A {
    public static void main (String[]args){
        int [][]x = new int [][]{{1,2},{3,4,5,6},{7,8,9}};
        for (int [] a : x){
            for (int i =a.length-1; i>-1; i-- ){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
        System.out.println("##############################");
        
        for (int j=x.length-1; j>-1; j-- ){
            for (int i =x[j].length-1; i>-1; i-- ){
                System.out.print(x[j][i]+" ");
            }
            System.out.println();
        }
        System.out.println("##############################");
        for (int i =x.length-1; i>-1; i-- ){
            for(int k : x[i]){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
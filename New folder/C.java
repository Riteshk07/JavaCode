class A {
    public static void main (String [] args){
        int[] a ={1,3,4,6,7,9};
        int x = binaryS(a, a.length, 5);
        System.out.println(x);
    }
    static int binaryS(int []arr, int len, int find){
        int l =0; 
        int r = len-1;
        int mid ;
        while(l<r){
            mid = (l+r)/2;
            if(find==arr[mid]){
                return mid;
            }else if(find < arr[mid]){
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return -r;
    }
}
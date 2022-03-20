class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int r=0;
        while (n != 0 && n>0){
            
            r= r*10+n%10;
            n=n/10;
        }
        // System.out.println(r);
        
        return r==x;
    }
    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.isPalindrome(123321));;
    }
}
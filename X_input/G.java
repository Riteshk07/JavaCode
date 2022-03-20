class A {
    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.isPalindrome(1221));
    }
}

class Solution {
    public boolean isPalindrome(int x) {
        boolean ans = false ;
    
        String y = String.valueOf(x);
        int n = y.length();
        for (int i=0,j=y.length()-1; i<n-1;  i++,j-- ){
            ans = y.charAt(i)==y.charAt(j);
            if (ans==false){
                break;
            }
        }
        return ans;
        
    }
}
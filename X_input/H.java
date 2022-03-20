class A {
    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.isAdd(121));
    }
}

class Solution {
    public int isAdd(int x) {
        int ans = 0 ;
        int t = 0;
        for (int i=0; i<3;  i++ ){
            t= x%10;
            x = x/10;
            ans += t;
        }
        return ans;
        
    }
}
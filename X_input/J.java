class A {
    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.isAdd(121));
        // System.out.println("\u0938\u0930 \u091C\u0940");
    }
}

class Solution {
    public int isAdd(int x) {
        int ans = 0;
        int n =0;
        while (x!=0){
            ans += x%10;
            x = x/10;
            n+=1;
        }
        System.out.println(n);
        return ans;
    }
}
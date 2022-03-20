class A {
    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.digitNo(1215647658));
        // System.out.println("\u0938\u0930 \u091C\u0940");
    }
}

class Solution {
    public int digitNo(int x) {
        int n =0;
        while (x!=0){
            x = x/10;
            n+=1;
        }
        // System.out.println(n);
        return n;
    }
}
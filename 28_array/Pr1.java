class Solution {
   
    public int[] getConcatenation(int[] nums) {
        int a = nums.length;
        int [] ans = new int [3*a];
        for (int i=0; i<a; i++){
            ans[i]= nums[i];
            ans[i+a]=nums[i];
            ans[i+a+a]=nums[i];
        }
        return ans;
    }
    public static void main (String[]args){
        int [] nums = {1,2,1};
        Solution x = new Solution();
        for (int i : x.getConcatenation(nums)){
            System.out.print(i+", ");
        }
    }
}
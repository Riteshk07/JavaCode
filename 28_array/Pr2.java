class Solution {
   
    public int[] getsum(int[] nums) {
        
        for (int i=1; i<nums.length; i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }
    public static void main (String[]args){
        int [] nums = {1,4,5,7,9,12,15};
        Solution x = new Solution();
        for (int i : x.getsum(nums)){
            System.out.print(i+", ");
        };
    }
}
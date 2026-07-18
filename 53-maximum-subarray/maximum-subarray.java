class Solution {
    public int maxSubArray(int[] nums) {
        
        int windowsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){
            windowsum =Math.max(windowsum+nums[i], nums[i]);
            maxsum= Math.max(windowsum , maxsum);
        }
        return maxsum;
    }
}
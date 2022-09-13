class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=0,sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            max=Math.max(max,sum-min);
            min=Math.min(min,sum);
        }
        return max;
    }
}
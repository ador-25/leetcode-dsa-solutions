class Solution {
    public int[] buildArray(int[] nums) {
        int size=nums.length;
        for(int i=0;i<size;i++)
            nums[i]=size*(nums[nums[i]]%size)+nums[i];
        for(int i=0;i<size;i++)
            nums[i]/=size;
        return nums;
    }
}
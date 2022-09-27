class Solution {
public int[] searchRange(int[] nums, int target) {
        return new int[]{firstSearch(nums,target),lastSearch(nums,target)};
    }
    public int firstSearch(int[]nums,int target){
        int left=0,right=nums.length-1;
        int found=-1;
        while(left<=right){
            int median=(left+right)>>>1;
            if(nums[median]==target) {
                found=median;
                right=median-1;
            }
            else if(nums[median]>target)
                right=median-1;
            else
                left=median+1;
        }
        return found;
    }
    public int lastSearch(int[]nums,int target){
        int left=0,right=nums.length-1;
        int found=-1;
        while(left<=right){
            int median=(left+right)>>>1;
            if(nums[median]==target) {
                found=median;
                left=median+1;
            }
            else if(nums[median]>target)
                right=median-1;
            else
                left=median+1;
        }
        return found;
    }
}
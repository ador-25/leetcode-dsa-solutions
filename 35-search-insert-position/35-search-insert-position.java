class Solution {
    public int searchInsert(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while (left<=right){
            int pivot= left+right >>>1;
            if(nums[pivot]>target){
                right=pivot-1;
            }
            else if(nums[pivot]<target){
                left=pivot+1;
            }
            else
                return pivot;
        }
        return left;
    }
}
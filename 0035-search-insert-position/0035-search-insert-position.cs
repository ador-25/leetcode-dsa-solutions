public class Solution {
    public int SearchInsert(int[] nums, int target) {
        int left=0,right=nums.Length-1;
        while (left<=right){
            int pivot= (left+right)>>1;
            if(nums[pivot]==target)
                return pivot;
            else if(nums[pivot]>target)
                right=pivot-1;
            else
                left=pivot+1;
        }
        return left;
    }
}
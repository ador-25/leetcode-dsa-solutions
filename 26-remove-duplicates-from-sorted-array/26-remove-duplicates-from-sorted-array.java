class Solution {
    public int removeDuplicates(int[] nums) {
        int fastPointer=1,slowPointer=0;
        while(fastPointer<nums.length){
            if(nums[fastPointer]!=nums[slowPointer]){
                nums[slowPointer+1]=nums[fastPointer];
                slowPointer++;
            } 
            fastPointer++;
                
        }
        return slowPointer+1;
    }
}
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int result[]= new int[nums.length];
        int slowPointer=0;
        for(int i=0;i<result.length;i=i+2){
            result[i]=nums[slowPointer];
            result[i+1]=nums[slowPointer+n];
            slowPointer++;
        }
        return result;
    }
}
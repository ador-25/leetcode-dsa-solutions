class Solution {
    public int[] getConcatenation(int[] nums) {
        int unit=nums.length;
        int[]result= new int[unit*2];
        for(int i=0;i<unit;i++){
            result[i]=nums[i];
            result[i+unit]=nums[i];
        }
        return result;
    }
}
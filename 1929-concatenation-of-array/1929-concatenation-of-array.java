class Solution {
    public int[] getConcatenation(int[] nums) {
        int newSize=nums.length*2, oldSize=nums.length;
        int[]ans= new int[newSize];
        for(int i=0;i<oldSize;i++){
            ans[i]=nums[i];
            ans[i+oldSize]=nums[i];
        }
        return ans;
    }
}
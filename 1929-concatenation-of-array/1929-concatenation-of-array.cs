public class Solution {
    public int[] GetConcatenation(int[] nums) {
        int oldSize=nums.Length,newSize=oldSize*2;
        int[]ans= new int[newSize];
        for(int i=0;i<oldSize;i++){
            ans[i]=nums[i];
            ans[i+oldSize]=nums[i];
        }
        return ans;
    }
}
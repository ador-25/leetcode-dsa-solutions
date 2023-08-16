public class Solution {
    public int MaximumDifference(int[] nums) {
        int maxDiff =  -1;
        int min = nums[0];
        for(int i=1; nums.Length>i;i++){
            int newDiff =  nums[i]-min;
            if(newDiff!=0){
                maxDiff = newDiff>maxDiff? newDiff:maxDiff;
                min = min> nums[i]? nums[i]:min;
            }

        }
        return maxDiff;
    }
}
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[]map= new int[101];
        for(int i=0;i<nums.length;i++)
            map[nums[i]]++;
        for(int i=1;i<map.length;i++){
            map[i]+=map[i-1];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]!=0?map[nums[i]-1]:0;

        }
        return nums;
    }
}
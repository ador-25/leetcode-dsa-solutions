class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        int []map= new int[101];
        for(int i=0;i<nums.length;i++) {
            if(map[nums[i]]!=0) {
                count += map[nums[i]];
            }
            map[nums[i]]++;
        }
        return count;
    }
}
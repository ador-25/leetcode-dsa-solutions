class Solution {
    public int numIdenticalPairs(int[] nums) {
        int []map=new int[101];
        map[nums[0]]++;
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(map[nums[i]]>0){
                count+=map[nums[i]];
            }
            map[nums[i]]++;
        }
        return count;
    }
}
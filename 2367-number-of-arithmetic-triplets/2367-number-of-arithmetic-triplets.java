class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> set= new HashSet<>();
        int count=0;
        set.add(nums[0]);
        set.add(nums[1]);
        for(int i=0;i<nums.length;i++){
            int temp=nums[i]-diff;
            if(set.contains(temp)){
                int flag=temp-diff;
                if(set.contains(flag)){
                    count++;
                }
            }
            set.add(nums[i]);
        }
        return count;
    }
}
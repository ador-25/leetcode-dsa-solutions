class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            Integer temp= map.put(nums[i],i);
            if(temp!=null && i-temp<=k)
                return true;
        }
        return false;
    }
}
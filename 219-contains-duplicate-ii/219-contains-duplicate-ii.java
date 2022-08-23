class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int temp= map.getOrDefault(nums[i],-1);
            if(temp!=-1){
                if(i-temp<=k)
                    return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }
}
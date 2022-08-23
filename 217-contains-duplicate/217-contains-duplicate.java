class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set= new HashSet<>(nums.length);
        for(int temp: nums){
            if(set.contains(temp))
                return true;
    
            set.add(temp);
        }
        return false;
    }
}
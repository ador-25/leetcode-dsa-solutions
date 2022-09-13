class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for(int item:nums)
            if(set.contains(item))
                return true;
            else
                set.add(item);
        return false;
    }
}
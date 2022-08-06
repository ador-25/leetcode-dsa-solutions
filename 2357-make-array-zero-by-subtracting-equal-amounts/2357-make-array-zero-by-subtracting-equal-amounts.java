class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet();
        for(int item:nums){
            if(item!=0)
                set.add(item);
        }
        return set.size();
    }
}
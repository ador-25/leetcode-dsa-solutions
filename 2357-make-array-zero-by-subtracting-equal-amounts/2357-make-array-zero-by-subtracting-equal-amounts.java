class Solution {
    public int minimumOperations(int[] nums) {
        TreeSet<Integer> set= new TreeSet<>();
        for(int temp:nums) {
            if (temp != 0)
                set.add(temp);
        }
        return set.size();
    }
}
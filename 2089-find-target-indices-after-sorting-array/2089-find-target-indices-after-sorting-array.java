class Solution {
public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res= new ArrayList<>();
        int low=0,equal=0;
        for(int i=0;i<nums.length;i++) {
            if (nums[i] < target)
                low++;
            else if(nums[i]==target)
                equal++;
        }
        int count=0;
        int next=low;
        while(count++!=equal){
            res.add(next++);
        }

        return res;
    }
}
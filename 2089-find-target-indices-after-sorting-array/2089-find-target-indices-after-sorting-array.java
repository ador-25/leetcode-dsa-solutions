class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res= new ArrayList<>();
        int[]map= new int[101];
        for(int i=0;i<nums.length;i++)
            map[nums[i]]++;
        int i=1;
        int sum=0;
        while(i!=target){
          sum+=map[i++];
        }
        int first=sum;
        int count=0;

        while(count++!=map[target]){
            res.add(first++);
        }
        return res;
    }
}
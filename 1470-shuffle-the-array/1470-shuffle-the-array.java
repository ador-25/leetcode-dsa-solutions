class Solution {
    public int[] shuffle(int[] nums, int n) {
        int result[]= new int[n*2];
        int slowPointer=0;
        for(int i=0;i<result.length;i+=2){
            result[i]=nums[slowPointer];
            result[i+1]=nums[slowPointer++ +n];
        }
        return result;
    }
}
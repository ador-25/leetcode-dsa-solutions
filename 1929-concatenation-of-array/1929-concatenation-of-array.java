class Solution {
    public int[] getConcatenation(int[] nums) {
        int inputSize=nums.length;
        int[] result= new int[inputSize*2];
        for(int i =0;i< inputSize;i++){
            result[i]=nums[i];
            result[i+inputSize]=nums[i];
        }
        return result;
    }
}
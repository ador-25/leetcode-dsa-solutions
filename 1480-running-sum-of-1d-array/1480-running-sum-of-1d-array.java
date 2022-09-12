class Solution {
    public int[] runningSum(int[]arr) {
        for(int i=1;i<arr.length;i++)
            arr[i]+=arr[i-1];
        return arr;
    }
}
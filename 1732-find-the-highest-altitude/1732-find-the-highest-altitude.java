class Solution {
    public int largestAltitude(int[] gain) {
        int maxGain=0,sum=0;
        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            if(maxGain<sum)
                maxGain=sum;
        }
        return maxGain;
    }
}
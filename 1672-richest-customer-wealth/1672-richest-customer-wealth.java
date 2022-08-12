class Solution {
    public int maximumWealth(int[][] accounts) {
        int maximumWealth= Integer.MIN_VALUE;
        for(int i=0;i< accounts.length;i++){
            int currentSum=0;
            for (int j=0;j<accounts[0].length;j++){
                currentSum+=accounts[i][j];
            }
            if(currentSum>maximumWealth)
                maximumWealth=currentSum;
        }
        return maximumWealth;
    }
}
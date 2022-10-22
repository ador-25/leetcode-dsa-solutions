class Solution {
    public int maxProfit(int[] prices) {
        int lowestCost=prices[0],maxProfit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]-lowestCost>maxProfit)
                maxProfit=prices[i]-lowestCost;
            if(lowestCost>prices[i])
                lowestCost=prices[i];
        }
        return maxProfit;
    }
}
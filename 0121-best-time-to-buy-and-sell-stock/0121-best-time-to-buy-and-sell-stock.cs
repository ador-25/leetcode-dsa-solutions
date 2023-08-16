public class Solution {
    public int MaxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;
        for(int i=0;i<prices.Length;i++){
            int profit = prices[i]-min;
            maxProfit= maxProfit < profit? profit:maxProfit;
            min = prices[i]<min? prices[i]:min;
        }
        return maxProfit;
    }
}
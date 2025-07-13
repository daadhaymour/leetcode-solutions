//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?envType=study-plan-v2&envId=top-interview-150

class Solution {
    public int maxProfit(int[] prices) {

        int buy = prices[0];
        int profit = 0;

        for(int i=0; i<prices.length; i++){
            if(prices[i] < buy){ //if element is less than previous buy value, then prices[i] is the new day to buy tock
                buy = prices[i];
            } else if(prices[i]-buy > profit){ //if new day price - buy is greater than current profit; next best day to sell; profit is updated
                profit = prices[i]-buy;

            }
        }
        return profit;
        
}
}

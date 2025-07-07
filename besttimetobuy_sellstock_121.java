//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/?envType=study-plan-v2&envId=top-interview-150

//only passed 111/212 test cases - will re-try later

class Solution {
    public int maxProfit(int[] prices) {

        // keep track of how much we are buying/selling for 
        int buy = 0;
        int sell = 0;

        // two pointers, left indicates previous day and right is the next day
        int left = 0;
        int right = 1;
        int profit = 0; //leep track of current profit
        int max_profit = 0; //what we want to return

        while(left < prices.length && right < prices.length){
        if (prices[right] < prices[left]){
            buy = prices[right];
            right++;
            left++;

        }
        else{ // when prices[right] > prices [left] aka probable day to sell

            sell = prices[right];
            profit = sell-buy;

            if(profit > max_profit){
                max_profit = profit;
            }
            right++;
        }
        }

        return max_profit;



    }
}

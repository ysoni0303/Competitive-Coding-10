// Problem1- https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/submissions/

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nothing as such

public class problem1 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        
        for(int i=1; i<prices.length;i++){
            if(prices[i] > prices[i-1]){
                profit += prices[i] - prices[i-1];
            }
        }
        return profit;
    }
}

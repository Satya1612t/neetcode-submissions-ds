class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0, profit = 0;
        for(int sell = 1; sell < prices.length; sell++){
            if(prices[sell] < prices[buy]){
                buy = sell;
            }
            int diff = prices[sell] - prices[buy];
            profit = Math.max(profit, diff);
        }
        return profit;
    }
}

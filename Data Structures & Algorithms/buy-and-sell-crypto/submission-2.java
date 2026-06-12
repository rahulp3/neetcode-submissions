class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int lowValue = prices[0];
        int lowIdx = 0;
        int upperIdx = 0;

        for(int i = 1 ; i < prices.length ; i++){
            if(prices[i] > lowValue){
                profit = Math.max(prices[i] - lowValue, profit);
                upperIdx = i;
            }else{
                lowValue = prices[i];
                lowIdx = i;
                upperIdx = i;
            }
        }

        return profit;
    }
}

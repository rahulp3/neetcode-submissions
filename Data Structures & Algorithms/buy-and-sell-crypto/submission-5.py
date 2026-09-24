class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if len(prices) < 2:
            return 0

        i = 0
        j = 1
        n = len(prices)
        profit = 0

        while j < n :
            if prices[i] < prices [j]:
                diff = prices[j] - prices[i]
                profit = max(profit, diff)
            else :
                i = j

            j = j + 1
            
        
        return profit

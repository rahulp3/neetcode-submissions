class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if len(prices) < 2:
            return 0

        i = 0
        j = 1
        n = len(prices)
        profit = 0

        while j < n and i < j:
            if prices[i] < prices [j]:
                diff = prices[j] - prices[i]
                profit = max(profit, diff)
                j = j + 1
            else :
                i = i + 1

            if i == j:
                j = j + 1
            
        
        return profit

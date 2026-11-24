class Solution:
    def maxArea(self, heights: List[int]) -> int:
        max_capacity = None
        right = len(heights) - 1
        left = 0

        while left < right:
            min_height = min(heights[left], heights[right])
            distance = right - left
            capacity = min_height * distance

            if (max_capacity is None) or (capacity > max_capacity) :
                max_capacity = capacity

            if heights[left] > heights[right]:
                right = right - 1
            else:
                left = left + 1
        
        return max_capacity
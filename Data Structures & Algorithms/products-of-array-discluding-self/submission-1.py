class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        forward_prod = []
        reverse_prod = []
        result = []
        n = len(nums)
        
        mul = 1
        for i in range(0, n):
            mul = mul * nums[i]
            forward_prod.append(mul)

        mul = 1
        reverse_prod = [1] * n
        for i in range (n - 1, -1, -1):
            mul = mul * nums[i]
            reverse_prod[i] = mul

        f = -1
        r = 1
        for i in range(0, n):
            if f < 0:
                result.append(reverse_prod[r])
            elif r >= n:
                result.append(forward_prod[f])
            else:
                result.append(forward_prod[f] * reverse_prod[r])

            f = f + 1
            r = r + 1
        return result
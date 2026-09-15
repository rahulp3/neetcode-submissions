class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hashmap = {}

        for i in range (0, len(nums)):
            check = target - nums[i]

            if check in hashmap:
                return [hashmap[check], i]
            else:
                hashmap[nums[i]] = i
        

        return []
class KthLargest:

    def __init__(self, k: int, nums: List[int]):
        self.k = k
        self.nums = nums

    def add(self, val: int) -> int:
        self.nums.append(val)
        # print("Nums : ", self.nums)
        return heapq.nlargest(self.k, self.nums)[self.k - 1]

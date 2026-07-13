class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Keeps the top k largest elements seen so far
        Queue<Integer> minHeap = new PriorityQueue<>(); 
        
        for (int num : nums) {
            minHeap.add(num);
            
            // If the heap grows larger than k, remove the smallest element
            if (minHeap.size() > k) {
                minHeap.poll(); 
            }
        }
        
        // The top of the min-heap is now the k-th largest element
        return minHeap.peek();
    }
}
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> minHeap = new PriorityQueue<Integer>();

        for(int num : nums){
            minHeap.add(num);
        }

        while(minHeap.size() != k){
            minHeap.poll();
        }

        return minHeap.peek();
    }
}

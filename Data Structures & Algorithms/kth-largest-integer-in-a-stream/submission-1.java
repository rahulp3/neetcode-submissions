class KthLargest {

    PriorityQueue<Integer> pQueue = new PriorityQueue<>();
    int target = 0;

    public KthLargest(int k, int[] nums) {
        this.target = k;
        for(int num : nums){
            add(num);
        }
    }
    
    public int add(int val) {
        if(pQueue.size() < target){
                pQueue.add(val);
            }else{
                if(val > pQueue.peek()){
                    pQueue.poll();
                    pQueue.add(val);
                }
            }
        return pQueue.peek();
    }
}

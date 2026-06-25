class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i < stones.length ; i++){
            pq.add(stones[i]);
        }

        while(!pq.isEmpty() && pq.size() != 1){
            System.out.println(pq.size());
            int element1 = pq.poll();
            int element2 = pq.poll();

            System.out.println("Element 1 : " + element1 + " Element 2 : " + element2);

            if(element1 != element2){
                pq.add(element1 - element2);
            }
        }

        if(!pq.isEmpty()){
            return pq.poll();
        }else{
            return 0;
        }
    }
}

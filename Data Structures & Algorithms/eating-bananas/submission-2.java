class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int minValue = 1;
        int maxValue = 0;
        int k = Integer.MAX_VALUE;

        for(int i = 0 ; i < n ; i++){
            maxValue = Math.max(maxValue, piles[i]);
        }

        while(minValue <= maxValue){
            int mid = (maxValue + minValue) / 2;
            int sum = 0;
            for(int i = 0 ; i < n ; i++){
                sum = sum + (int)Math.ceil((double)piles[i]/mid);
            }

            if(sum > h){
                minValue = mid + 1;
            }else if(sum <= h){
                maxValue = mid - 1;
                k = Math.min(k,mid);
            }
        }

        return minValue;
    }
}

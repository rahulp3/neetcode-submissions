class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        boolean duplicate = false;

        for(int i = 0 ; i < nums.length ; i++){
            if(mp.containsKey(nums[i])){
                duplicate = true;
                return duplicate;
            }else{
                mp.put(nums[i], 1);
            }
        }

        return duplicate;
    }
}
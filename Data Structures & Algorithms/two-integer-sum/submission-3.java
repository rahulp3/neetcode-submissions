class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> lookupMap = new HashMap<>();
        int[] result = new int[2];

        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];

            if(lookupMap.containsKey(diff) && i != 0){
                result[0] = lookupMap.get(diff);
                result[1] = i;
                return result;
            }else{
                lookupMap.put(nums[i], i);
            }  
        }
        return result;
    }
}

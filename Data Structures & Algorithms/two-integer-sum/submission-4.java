class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> lookupMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];

            if(lookupMap.containsKey(diff)){
                return new int[]{lookupMap.get(diff), i};
            }
            
            lookupMap.put(nums[i], i);
        }
        return new int[0];
    }
}

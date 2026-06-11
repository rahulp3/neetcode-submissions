class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> lookupMap = new HashMap<>();
        int[] result = new int[2];

        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];

            if(lookupMap.containsKey(diff) && i != 0){
                return new int[]{lookupMap.get(diff), i};
            }else{
                lookupMap.put(nums[i], i);
            }  
        }
        return result;
    }
}

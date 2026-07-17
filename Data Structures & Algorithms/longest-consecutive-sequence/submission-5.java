class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        HashSet<Integer> values = new HashSet<>();
        for (int num : nums) {
            values.add(num);
        }

        int longestStreak = 0;

        for (int val : values) {

            if (!values.contains(val - 1)) {
                int currentNum = val;
                int currentStreak = 1;

                while (values.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
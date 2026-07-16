class Solution {
    public int longestConsecutive(int[] nums) {
        // Edge case: empty input array
        if (nums == null || nums.length == 0) {
            return 0;
        }

        HashSet<Integer> values = new HashSet<>();
        for (int num : nums) {
            values.add(num);
        }

        int longestStreak = 0;

        for (int val : values) {
            // Check if 'val' is the START of a sequence
            // If it contains val - 1, then 'val' is not the start, so skip it!
            if (!values.contains(val - 1)) {
                int currentNum = val;
                int currentStreak = 1;

                // Expand forward from the start element
                while (values.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                // Update the maximum streak length found so far
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
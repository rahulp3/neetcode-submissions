class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Base case safety check
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            // Convert string to character array and sort it to create the key
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedKey = String.valueOf(charArray);
            
            // If the key doesn't exist, create a new list for it
            map.putIfAbsent(sortedKey, new ArrayList<>());
            // Add the original string to its anagram group
            map.get(sortedKey).add(s);
        }
        
        // Return all the grouped lists
        return new ArrayList<>(map.values());
    }
}

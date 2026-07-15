
class Solution {
    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        // Drop primitive string concatenation to eliminate unnecessary heap allocation spikes
        StringBuilder encodedString = new StringBuilder();

        for (String s : strs) {
            // Format: [length of string] + [# delimiter] + [original text]
            encodedString.append(s.length()).append('#').append(s);
        }

        return encodedString.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String str) {
        List<String> decodedStrings = new ArrayList<>();
        
        // Null protective check
        if (str == null || str.length() == 0) {
            return decodedStrings;
        }

        int i = 0;
        while (i < str.length()) {
            // 1. Locate the position of the next delimiter token character
            int delimiterPos = str.indexOf('#', i);
            
            // 2. Extract the prefix digit string and parse it to an int
            int length = Integer.parseInt(str.substring(i, delimiterPos));
            
            // 3. Jump forward to grab the text segment based on the exact character length
            int start = delimiterPos + 1;
            int end = start + length;
            
            decodedStrings.add(str.substring(start, end));
            
            // 4. Slide the main pointer right to the index position of the next block
            i = end;
        }

        return decodedStrings;
    }
}
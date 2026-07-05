class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n < 2){
            return n;
        }

        int i = 0;
        int j = 1;
        int count = 0;
        HashMap<Character, Integer> mp = new HashMap<>();

        while(i < j && j < n){
            if(mp.isEmpty()){
                mp.put(s.charAt(i), 1);
            }
            if(!mp.containsKey(s.charAt(j))){
                mp.put(s.charAt(j), 1);
                j++;
            }else{
                count = count > mp.size() ? count : mp.size();
                mp = new HashMap<>();
                i++;
                j = i + 1;
            }
        }

        count = count > mp.size() ? count : mp.size();

        return count;
    }
}

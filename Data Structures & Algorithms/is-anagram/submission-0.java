class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }else{
            HashMap<Character, Integer> mp = new HashMap<>();

            for(char ch : s.toCharArray()){
                if(mp.containsKey(ch)){
                    int val = mp.get(ch);
                    val++;
                    mp.put(ch, val);
                }else{
                    mp.put(ch, 1);
                }
            }

            System.out.println(mp);

            for(char ch : t.toCharArray()){
                if(mp.containsKey(ch)){
                    int val = mp.get(ch);
                    val--;
                    mp.put(ch, val);
                }else{
                    mp.put(ch, 1);
                }
            }

            System.out.println(mp);

            for(int value : mp.values()){
                if(value != 0){
                    return false;
                }
            }

            return true;
        }
    }
}

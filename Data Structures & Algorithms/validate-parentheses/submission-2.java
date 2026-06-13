class Solution {
    public boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();

        if(s.length()%2 != 0){
            return false;
        }
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                st.push(')');
            } else if (c == '{') {
                st.push('}');
            } else if (c == '[') {
                st.push(']');
            } else {
                if (st.isEmpty() || st.pop() != c) {
                    return false;
                }
            }
        }
        
        return st.isEmpty();
    }
}

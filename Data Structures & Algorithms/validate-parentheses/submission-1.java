class Solution {
    public boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();

        if(s.length()%2 != 0){
            return false;
        }else{
            for(int i = 0 ; i < s.length() ; i++){
                if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                    st.push(s.charAt(i));
                }else if(st.isEmpty()){
                    st.push(s.charAt(i));
                }else{
                    if((s.charAt(i) == ')' && st.peek() != '(') ||
                        (s.charAt(i) == '}' && st.peek() != '{') ||
                        (s.charAt(i) == ']' && st.peek() != '[')){
                            return false;
                        }else{
                            st.pop();
                        }
                }
            }
        }

        if(st.isEmpty()){
            return true;
        }

        return false;
    }
}

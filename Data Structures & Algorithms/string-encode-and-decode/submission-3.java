class Solution {
    public String encode(List<String> strs) {
        String encodedString = "";
        int n = strs.size();

        if( n == 0){
            return null;
        }

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                encodedString = strs.get(i);
            } else {
                encodedString += "~" + strs.get(i);
            }
        }

        

        return encodedString;
    }

    public List<String> decode(String str) {
        List<String> decodedString = new ArrayList<>();

        if( str == null){
            return decodedString;
        }

        int n = str.length();
        String val = "";

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '~') {
                decodedString.add(val);
                val = "";
            } else {
                val += str.charAt(i);
            }
        }

        decodedString.add(val);

        return decodedString;
    }
}

class Solution {
    public boolean isPalindrome(String s) {
        String fs = s.replaceAll("[^a-zA-Z0-9]", "");
        fs = fs.toLowerCase();
        int left = 0;
        int right = fs.length() - 1;

        while(left < right){
            if(fs.charAt(left) != fs.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

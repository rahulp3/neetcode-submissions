class Solution:
    def isPalindrome(self, s: str) -> bool:
        lower_str = s.lower()
        filtered_str = ''
        
        for i in lower_str:
            if i.isalnum():
                filtered_str = filtered_str + i

        j = len(filtered_str) - 1
        i = 0
        
        while i < j :
            if filtered_str[i] != filtered_str[j]:
                return False
            
            i = i + 1
            j = j - 1

        return True
class Solution:
    def isPalindrome(self, s: str) -> bool:
        lower_str = s.lower()
        # filtered_str = ''
        
        # # for i in lower_str:
        # #     if i.isalnum():
        # #         filtered_str = filtered_str + i

        j = len(lower_str) - 1
        i = 0
        
        while i < j :
            if lower_str[i].isalnum() and lower_str[j].isalnum():
                if lower_str[i] != lower_str[j]:
                    return False
            elif not lower_str[i].isalnum:
                i = i + 1
                continue
            else:
                j = j -1
                continue
            
            i = i + 1
            j = j - 1

        return True
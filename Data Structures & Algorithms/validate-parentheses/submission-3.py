class Solution:
    def isValid(self, s: str) -> bool:
        if len(s)%2 != 0 :
            return False

        stack = []

        for i in s:
            
            if i == '(' or i == '{' or i == '[' :
                stack.append(i)
                # print(stack)
            elif (len(stack) == 0) or (i == ')' and stack.pop() != '(' ) or (i == '}' and stack.pop() != '{') or (i == ']' and stack.pop() != '['):
                return False

        if len(stack) != 0:
            return False
        else:
            return True
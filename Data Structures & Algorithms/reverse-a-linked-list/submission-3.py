# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        
        current = head
        previous = current
        i = 0

        while current != None :
            nxt = current.next
            
            if i == 0:
                current.next = None
            else:
                current.next = previous

            previous = current
            current = nxt
            i = i + 1

        return previous



# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        # if head already points to none return none
        if not head:
            return None

        #initialize new head of reversed LL as current head
        newHead = head

        #recursive case
        if head.next:
            newHead = self.reverseList(head.next)
            head.next.next = head
        #make head node new tail node
        head.next = None
        return newHead

        
        
        

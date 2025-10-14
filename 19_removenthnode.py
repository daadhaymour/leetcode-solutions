# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        """
        :type head: Optional[ListNode]
        :type n: int
        :rtype: Optional[ListNode]
        """
        nodes = []
        cur = head
        while cur:
            nodes.append(cur)
            cur = cur.next
       
        i = 0
        index_to_remove = len(nodes) - n   
        # if the index is the head, just move the next pointer to the next node
        if index_to_remove == 0:
            return head.next     
        prev = nodes[index_to_remove -1]
        prev.next = prev.next.next if prev.next else None
        return head
        
        
        

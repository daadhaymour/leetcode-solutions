# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reorderList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: None Do not return anything, modify head in-place instead.
        """
        if not head:
         return

        nodes = []
        cur = head

        while cur:
            nodes.append(cur)
            cur = cur.next
        
        i = 0
        j = len(nodes)-1

        while i<j:
            nodes[i].next = nodes[j]
            i += 1
            if i >= j:
                break
            nodes[j].next = nodes[i]
            j -= 1

        #last node pointer = none
        nodes[i].next = None


                


        
        

class Solution(object):
    def countOperations(self, num1, num2):
        """
        :type num1: int
        :type num2: int
        :rtype: int
        """
        ops = 0
        while num1 > 0 and num2 > 0:
            ops +=1
            if num1 >= num2:
                num1 = num1-num2
            elif num2 >= num1:
                num2 = num2 - num1
        return ops
        

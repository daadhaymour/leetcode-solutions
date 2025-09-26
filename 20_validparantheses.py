class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        stack = []
        #create dictionary to store closing bracket -> corresponding opening bracket

        closetoOpen = {")":"(","]" :"[", "}":"{"}

        #loop through string
        for c in s:
            #check if c is a closing bracket
            if c in closetoOpen:
                #check if stack is empty & if top elem in stack == opening bracket (if true pop opening bracket)
                if stack and stack[-1] == closetoOpen[c]:
                    stack.pop()
                #else return false
                else:
                    return False 
            #else then append c to stack
            else:
                stack.append(c)
        
        return True if not stack else False
        

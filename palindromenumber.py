class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        #edge case
        if x <0:
            return False
        
        #store reverse string of int x
        x_str_rev = str(x)[::-1]
        #convert back to 
        x_rev_int = int(x_str_rev)

        #compare
        if x == x_rev_int:
            return True
        else:
            return False

        

        

        

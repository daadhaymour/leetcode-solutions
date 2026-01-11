class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        str_list = map(str,digits) #convert list to string list
        str1 = "".join(str_list) #convert to a single string
        digits_int = int(str1) #convert to int
        digits_int += 1 #plus 1
        new_digits = map(int, str(digits_int)) #convert back to list of int

        return new_digits
        

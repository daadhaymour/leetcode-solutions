class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """

        n = 0 #length of last word
        trimmed_s = s.strip() #remove spaces at beginning and end of string
        for i in range(len(trimmed_s)):
            if trimmed_s[i] == " " : #if encounter space reset n
                n = 0
            else:
                n += 1
        return n
        

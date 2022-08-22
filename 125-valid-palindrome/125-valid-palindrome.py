class Solution(object):
    def isPalindrome(self, s):
        i = 0
        j = -1
        length = len(s)
        if length == 1:
            return True
        
        while i != length+j:
            if i > length - 1:
                return True
            if not s[i].isalnum():
                i += 1
            elif not s[j].isalnum():
                j -= 1
            else:
                if s[i].lower() != s[j].lower():
                    return False
                i += 1
                j -= 1
        
        return True
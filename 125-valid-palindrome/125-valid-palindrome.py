class Solution(object):
   def isPalindrome(self, s):
    s_alnum = list(filter(str.isalnum, s.lower()))
    mid = len(s_alnum) // 2
    for i in range(mid):
        if s_alnum[i] != s_alnum[-i-1]:
            return False
    return True
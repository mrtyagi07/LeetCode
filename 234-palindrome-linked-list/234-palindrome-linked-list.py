class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        
        # convert it into a normal list
        ls = []
        while head != None:
            ls.append(head.val)
            head = head.next
            
        # check for palindrome
        if ls == ls[::-1]:
            return True
        else: 
            return False

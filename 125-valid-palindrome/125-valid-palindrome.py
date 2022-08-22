class Solution:
    def isPalindrome(self, s: str) -> bool:
        rev=""
        reversed_string=""
        
        sliced_string="".join(filter(str.isalnum, s)).lower()

        reversed_string=sliced_string[::-1]

        if reversed_string==sliced_string:
            return True
        else:
            return False
        

class Solution {
    public boolean isPalindrome(String s) {
        char[] ch = s.toCharArray(); // make it an array of chars
        if (ch.length == 0)
            return true;
        return isPalRec(ch, 0, ch.length - 1);
    }
    
    // l for left index
    // r for right index
    private boolean isPalRec(char[] s, int l, int r) {
        if (l >= r) 
            return true;
        
        if (!isAlphaNum(s[l]))
            return isPalRec(s, l + 1, r); // increment l
        else if (!isAlphaNum(s[r]))
            return isPalRec(s, l, r - 1); // decrement r

        if ((s[l] | 32) != (s[r] | 32)) // deals with upper vs lowercase 
            return false;
        else 
            return isPalRec(s, l + 1, r - 1); // if same, increment l and decrement r
    }
    
    private boolean isAlphaNum(char c) {
        return (
            (c <= 'z' && c >= 'a') ||
            (c <= 'Z' && c >= 'A') ||
            (c <= '9' && c >= '0')
        );
    }
}
















// class Solution {
//   public boolean isPalindrome(String s) {
//         s = s.toLowerCase();
         
//         int left = 0, right = s.length() - 1;
//         while(left < right){
            
//  while(left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;
//  while(left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            
//     if(s.charAt(left++) != s.charAt(right--)) return false;
//         }
//         return true;
//     }
// };
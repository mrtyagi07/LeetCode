class Solution {
    public boolean isPalindrome(String s) {
  int lo = 0, hi = s.length() - 1;
  while (lo < hi) { 
    
    while (lo < hi && !isValid(s.charAt(lo))) lo += 1;
    
    while (lo < hi && !isValid(s.charAt(hi))) hi -= 1;
   
    if (lo < hi) {
      if (isCharDiff(s.charAt(lo), s.charAt(hi))) return false;
    }
    lo += 1; hi -= 1; 
  }
  return true;
}

private boolean isValid(char ch) {
  return Character.isLetterOrDigit(ch);
}

private boolean isCharDiff(char ch1, char ch2) {
  return Character.toLowerCase(ch1) != Character.toLowerCase(ch2);
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
class Solution {
      public char repeatedCharacter(String s) {
    int cnt[]= new int[26];
    for(char ch:s.toCharArray()) if(++cnt[ch-'a']==2) return ch;
    return 'a';
}  
    }

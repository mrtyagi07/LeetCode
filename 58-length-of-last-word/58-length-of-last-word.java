class Solution {
    public int lengthOfLastWord(String s) {
       int count=0;
        char[] sArray = s.toCharArray();
         int len=sArray.length-1;
        while(sArray[len]==' ')
            len--;
        
        while(len>-1  &&  sArray[len]!=' '){
            count++;
            len--;
        }
        return count;
    }
}
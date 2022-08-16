class Solution {
    public int firstUniqChar(String s) {
        int index = -1;
        
        int[] chars = new int[125];
        
        for(char ch : s.toCharArray()){
            chars[ch]++;
        }
        int i = 0;
        for(char ch : s.toCharArray()){
            if(chars[ch] == 1){
                return i;
            }
            i++;
        }
        
        return index;
    }
}
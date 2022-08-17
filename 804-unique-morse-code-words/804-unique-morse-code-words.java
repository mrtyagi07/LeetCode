class Solution {
   public int uniqueMorseRepresentations(String[] words) {
        String[] arr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for(String word : words){
            String curr = "";
            for(char w : word.toCharArray())
                curr += arr[w-'a'];
            set.add(curr);
        }
        return set.size();
    }
}
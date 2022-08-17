class Solution {
public:
    string convert(string s,vector<string> &table){
        string res;
        for(auto i : s){
            res += table[i - 'a'];
        }
        
        return res;
    }
    
    int uniqueMorseRepresentations(vector<string>& words) {
        vector<string> table = {".-","-...","-.-.","-..",".","..-.","--.","....",".."
                                ,".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                                "...","-","..-","...-",".--","-..-","-.--","--.."};
        
        unordered_map<string,int> mp;
        for(auto i : words){
            mp[convert(i,table)]++;
        }
        return mp.size();
    }
};;
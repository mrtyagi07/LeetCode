class Solution {
public: 
    void remspaces(string &s){
        while(s[s.length()-1]==' '){
            s.erase((s.length()-1),1);
        }
    }
    int lengthOfLastWord(string s) {
        int count=0;
        remspaces(s);
        for(int i=s.length()-1;i>=0;i--){
            if(s[i]!=' '){
                count++;
                continue;
            }
            break;
        }
        return count;
    }
};
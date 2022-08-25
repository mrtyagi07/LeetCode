class Solution {
public:
    bool canConstruct(string a, string b) {
        int h[26] = {0};
        for (char &c: b) {
            ++h[c -'a'];
        }
        for (char &c: a) {
            if (h[c-'a'] == 0) 
                return 0;
            --h[c-'a'];
        }
        return 1;
    }
};
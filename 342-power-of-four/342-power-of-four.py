class Solution {
private: 
    bool solve(double n){
        
        if(n == 1) return true;
        
        if(n <= 0) return false;
        
        return solve(n/4);
    }
public:
    bool isPowerOfFour(int n) {
        
     if(n<0)
         return false;
        
        
     return solve(n); 
    }
};
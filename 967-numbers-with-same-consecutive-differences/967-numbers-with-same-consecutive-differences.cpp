class Solution {
public:
    
    int n,k;
    
    void DFS(int i, int d, int &pth, vector<int> &ret)
    {
        pth=pth*10+d;
        
        if(i==n-1)
        {
         ret.push_back(pth);
         pth=pth/10;
         return;
        }
        if(d-k>=0 && d-k <=9)
        {
            DFS(i+1,d-k,pth, ret);
        }
        if(d+k>=0 && d+k<=9 && k!=0)
        {
            DFS(i+1,d+k,pth,ret);
        }
        pth=pth/10;
    }
    
    vector<int> numsSameConsecDiff(int n1, int k1) {
        
        n=n1; k=k1; int pth=0;
        vector<int> ret;
        
        for(int i=1;i<=9;i++) DFS(0,i,pth,ret);
        
        return(ret);
        
    }
};
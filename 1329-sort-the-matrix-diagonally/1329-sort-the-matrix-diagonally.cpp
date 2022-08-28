class Solution {
public:
    vector<vector<int>> diagonalSort(vector<vector<int>>& mat) {
        int n=mat.size();
        int m=mat[0].size();
        int i=n-1,j=0;
        int cnt=0;
        while(i>=0){
            j=0;
            vector<int> v;
            for(int k=i;k<n and j<m;k++,j++){
                v.push_back(mat[k][j]);
            }
            
            sort(v.begin(),v.end());
            int l=0;
            j=0;
            for(int k=i;k<n and j<m;k++,j++){
                mat[k][j]=v[l];
                l++;
            }
            i--;
        }
        
        while(++cnt<m){
            j=cnt;
            i=0;
            vector<int> v;
            for(;i<n and j<m; i++,j++){
                v.push_back(mat[i][j]);
            }
            
            sort(v.begin(),v.end());
            i=0,j=cnt;
            int l=0;
            
            for(;i<n and j<m;i++,j++){
                mat[i][j]=v[l];
                l++;
            }
            
        }
        
        
        return mat;
    }
};
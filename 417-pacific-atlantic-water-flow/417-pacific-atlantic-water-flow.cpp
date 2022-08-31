class Solution {
public:
    void dfs(int i, int j,vector<vector<bool>>&arr,vector<vector<int>>& heights){
        //base case
        if(arr[i][j]==1)
            return;
        
        arr[i][j]=1;
        if(i-1>=0 and heights[i][j]<=heights[i-1][j])
            dfs(i-1,j,arr,heights);
        if(i+1<arr.size() and heights[i][j]<=heights[i+1][j])
            dfs(i+1,j,arr,heights);
        if(j-1>=0 and heights[i][j]<=heights[i][j-1])
            dfs(i,j-1,arr,heights);
        if(j+1<arr[0].size() and heights[i][j]<=heights[i][j+1])
            dfs(i,j+1,arr,heights);
    }
    void solve(int x, int y,vector<vector<bool>>&arr,vector<vector<int>>& heights){
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<arr[0].size();j++){
                if(i==x || j==y)
                    dfs(i,j,arr,heights);
            }
        }
    }
    vector<vector<int>> pacificAtlantic(vector<vector<int>>& heights) {
        int row=heights.size();
        int col=heights[0].size();
        vector<vector<bool>>pacific(row,vector<bool>(col,0));
        vector<vector<bool>>atlantic(row,vector<bool>(col,0));
        vector<vector<int>>ans;
        solve(0,0,pacific,heights);
        solve(row-1,col-1,atlantic,heights);
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(pacific[i][j] and atlantic[i][j])
                    ans.push_back({i,j});
            }
        }
        return ans;
    }
};
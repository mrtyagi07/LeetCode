class Solution {
    int[][] dp;
    public int uniquePaths(int m, int n) {
        dp=new int[m][n];
        for(int[] d:dp)
        {
            Arrays.fill(d,-1);
        }
    
        return helper(m,n,0,0);
    }
    
    public int helper(int m,int n,int row,int col)
    {
        if(row<0 || col<0 || row>=m || col>=n)
            return 0;
        
        if(row==m-1 && col==n-1)
        {
            return 1;
        }
        
        if(dp[row][col]>-1)
            return dp[row][col];
        
        dp[row][col]=helper(m,n,row+1,col)+helper(m,n,row,col+1);
        return dp[row][col];
    }
}
